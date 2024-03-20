package com.wake.mapper;

import com.wake.pojo.Emp;
import com.wake.pojo.vo.EmpVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
* @author Administrator
* @description 针对表【emp(员工表)】的数据库操作Mapper
* @createDate 2024-03-19 23:31:46
* @Entity com.wake.pojo.Emp
*/
public interface EmpMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    List<Emp> selectBySelective(@Param("empVo") EmpVo empVo);

    int deleteByIds(Integer[] ids);

    Emp findById(Integer id);
}
