package com.wake.service;

import com.wake.pojo.Emp;
import com.wake.pojo.vo.EmpVo;
import com.wake.utils.Result;

public interface EmpService {
    /**
     * 按条件查询 分页显示
     * @param empVo
     * @return
     */
    Result queryPage(EmpVo empVo);

    /**
     * 批量删除员工的数据信息
     * @param ids
     * @return
     */
    Result deleteByIds(Integer[] ids);

    Result addEmp(Emp emp);

    /**
     * 修改员工的数据信息
     * @param emp
     * @return
     */
    Result updateEmp(Emp emp);

    Result queryById(Integer id);
}
