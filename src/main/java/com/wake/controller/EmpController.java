package com.wake.controller;

import com.wake.pojo.Emp;
import com.wake.pojo.vo.EmpVo;
import com.wake.service.EmpService;
import com.wake.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 */
@RestController
@RequestMapping("emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    /**
     * 分页条件查询
     * @param empVo
     * @return
     */
    @GetMapping
    public Result queryPage(EmpVo empVo){
        Result result = empService.queryPage(empVo);
        return result;
    }

    /**
     * 批量删除员工的数据信息
     * @param ids
     * @return
     */
    @DeleteMapping("{ids}")
    public Result deleteByIds(@PathVariable Integer[] ids){
        Result result = empService.deleteByIds(ids);
        return result;
    }

    /**
     * 添加员工的信息
     * @param emp
     * @return
     */
    @PostMapping
    public Result addEmp(@RequestBody Emp emp){
        Result result = empService.addEmp(emp);
        return result;
    }

    /**
     * 根据主键ID查询员工的信息 (用于数据回显
     * @param Id
     * @return
     */
    @GetMapping("{id}")
    public Result queryById(@PathVariable("id") Integer id){
        Result result = empService.queryById(id);
        return result;
    }

    /**
     * 修改员工的数据信息
     * @return
     */
    @PutMapping
    public Result updateEmp(@RequestBody Emp emp){
        Result result = empService.updateEmp(emp);
        return result;
    }
}