package com.ls.dao;

import com.ls.entity.SystemConf;
import com.ls.entity.SystemConfExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemConfMapper {
    int countByExample(SystemConfExample example);

    int deleteByExample(SystemConfExample example);

    int insert(SystemConf record);

    int insertSelective(SystemConf record);

    List<SystemConf> selectByExampleWithBLOBs(SystemConfExample example);

    List<SystemConf> selectByExample(SystemConfExample example);

    int updateByExampleSelective(@Param("record") SystemConf record, @Param("example") SystemConfExample example);

    int updateByExampleWithBLOBs(@Param("record") SystemConf record, @Param("example") SystemConfExample example);

    int updateByExample(@Param("record") SystemConf record, @Param("example") SystemConfExample example);
}