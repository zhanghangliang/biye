package com.ls.dao;

import com.ls.entity.ManagerInfo;
import com.ls.entity.ManagerInfoExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerInfoMapper {
    int countByExample(ManagerInfoExample example);

    int deleteByExample(ManagerInfoExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(ManagerInfo record);

    int insertSelective(ManagerInfo record);

    List<ManagerInfo> selectByExample(ManagerInfoExample example);

    ManagerInfo selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") ManagerInfo record, @Param("example") ManagerInfoExample example);

    int updateByExample(@Param("record") ManagerInfo record, @Param("example") ManagerInfoExample example);

    int updateByPrimaryKeySelective(ManagerInfo record);

    int updateByPrimaryKey(ManagerInfo record);
}