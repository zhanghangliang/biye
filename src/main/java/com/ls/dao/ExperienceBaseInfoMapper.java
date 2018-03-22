package com.ls.dao;

import com.ls.entity.ExperienceBaseInfo;
import com.ls.entity.ExperienceBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExperienceBaseInfoMapper {
    int countByExample(ExperienceBaseInfoExample example);

    int deleteByExample(ExperienceBaseInfoExample example);

    int deleteByPrimaryKey(Integer experienceId);

    int insert(ExperienceBaseInfo record);

    int insertSelective(ExperienceBaseInfo record);

    List<ExperienceBaseInfo> selectByExampleWithBLOBs(ExperienceBaseInfoExample example);

    List<ExperienceBaseInfo> selectByExample(ExperienceBaseInfoExample example);

    ExperienceBaseInfo selectByPrimaryKey(Integer experienceId);

    int updateByExampleSelective(@Param("record") ExperienceBaseInfo record, @Param("example") ExperienceBaseInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ExperienceBaseInfo record, @Param("example") ExperienceBaseInfoExample example);

    int updateByExample(@Param("record") ExperienceBaseInfo record, @Param("example") ExperienceBaseInfoExample example);

    int updateByPrimaryKeySelective(ExperienceBaseInfo record);

    int updateByPrimaryKeyWithBLOBs(ExperienceBaseInfo record);

    int updateByPrimaryKey(ExperienceBaseInfo record);
    
    //add
    List<ExperienceBaseInfo> selectByStatus(@Param("status")Integer status,@Param("num")Integer num);
}