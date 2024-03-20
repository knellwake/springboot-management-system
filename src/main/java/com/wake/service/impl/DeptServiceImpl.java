package com.wake.service.impl;

import com.wake.mapper.DeptMapper;
import com.wake.pojo.Dept;
import com.wake.service.DeptService;
import com.wake.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * 部门业务层实现类
 */
@Service
@Slf4j
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Result queryList() {
        List<Dept> deptList = deptMapper.selectList();

        if (deptList.isEmpty()) {
            return Result.error("数据为空");
        }

        return Result.success(deptList);
    }

    @Override
    public Result deleteById(Integer id) {
        int rows = deptMapper.deleteByPrimaryKey(id.longValue());

        if (rows > 0) {
            return Result.success(null);
        }

        return Result.error("为空");
    }

    @Override
    public Result addDept(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());

        int rows = deptMapper.insert(dept);

        if (rows > 0) {
            return Result.success(null);
        }

        return Result.error("为空");
    }

    @Override
    public Result queryById(Integer id) {
        Dept dept = deptMapper.selectByPrimaryKey(id.longValue());
        if (dept == null) {
            return Result.error("null");
        }
        return Result.success(dept);
    }

    @Override
    public Result updateDept(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        int rows = deptMapper.updateById(dept);

        if (rows > 0) {
            return Result.success(null);
        }

        return Result.error("为空");
    }
}