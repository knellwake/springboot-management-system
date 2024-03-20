package com.wake.mapper;

import com.wake.pojo.Dept;

import java.util.List;

/**
* @author Administrator
* @description 针对表【dept(部门表)】的数据库操作Mapper
* @createDate 2024-03-19 23:31:46
* @Entity com.wake.pojo.Dept
*/
public interface DeptMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    /**
     * 查询全部信息
     * @return
     */
    List<Dept> selectList();


    int updateById(Dept dept);
}
