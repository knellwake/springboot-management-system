package com.wake.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wake.mapper.EmpMapper;
import com.wake.pojo.Emp;
import com.wake.pojo.vo.EmpVo;
import com.wake.service.EmpService;
import com.wake.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 员工业务层实现
 */
@Service
@Slf4j
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public Result queryPage(EmpVo empVo) {
        if (empVo.getPage() == null || empVo.getPageSize()== null) {
            PageHelper.startPage(1, 10);
        }else{
            PageHelper.startPage(empVo.getPage(),empVo.getPageSize());
        }

        List<Emp> empList = empMapper.selectBySelective(empVo);

        PageInfo<Emp> empPageInfo = new PageInfo<>(empList);

        Map map = new HashMap();
        map.put("total",empPageInfo.getTotal());
        map.put("rows",empList);

        if (empList.isEmpty()){
            return Result.error("无");
        }

        return Result.success(map);
    }

    @Override
    public Result deleteByIds(Integer[] ids) {
       int rows = empMapper.deleteByIds(ids);

        if (rows > 0) {
            return Result.success(null);
        }

        return Result.error("为空");
    }

    @Override
    public Result addEmp(Emp emp) {
        if (emp == null){
            return Result.error("为空");
        }

        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());

        int rows =  empMapper.insert(emp);

        if (rows > 0) {
            return Result.success(null);
        }

        return Result.error("为空!");
    }

    @Override
    public Result updateEmp(Emp emp) {
        if(empMapper.selectByPrimaryKey(emp.getId().longValue())==null){
            return Result.error("为空!");
        }

        emp.setUpdateTime(LocalDateTime.now());

        int rows = empMapper.updateByPrimaryKeySelective(emp);

        if (rows > 0) {
            return Result.success(null);
        }

        return Result.error("修改失败!");
    }

    @Override
    public Result queryById(Integer id) {
        Emp emp = empMapper.findById(id);

        if (emp != null){
            log.info(emp.toString());
            return Result.success(emp);
        }

        return Result.error("修改失败!");
    }
}