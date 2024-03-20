package com.wake.service;

import com.wake.pojo.Dept;
import com.wake.utils.Result;

public interface DeptService {
    /**
     * 部门列表数据查询
     * @return
     */
    Result queryList();

    /**
     * 根据ID删除部门数据
     * @param id
     * @return
     */
    Result deleteById(Integer id);

    /**
     * 添加部门数据
     * @param dept
     * @return
     */
    Result addDept(Dept dept);

    /**
     * 根据ID查询部门数据
     * @param id
     * @return
     */
    Result queryById(Integer id);

    Result updateDept(Dept dept);
}
