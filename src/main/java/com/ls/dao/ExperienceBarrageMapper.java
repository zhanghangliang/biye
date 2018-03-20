package com.ls.dao;

import com.ls.entity.ExperienceBarrage;
import com.ls.entity.ExperienceBarrageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExperienceBarrageMapper {
    int countByExample(ExperienceBarrageExample example);

    int deleteByExample(ExperienceBarrageExample example);

    int deleteByPrimaryKey(Integer experienceId);

    int insert(ExperienceBarrage record);

    int insertSelective(ExperienceBarrage record);

    List<ExperienceBarrage> selectByExample(ExperienceBarrageExample example);

    ExperienceBarrage selectByPrimaryKey(Integer experienceId);

    int updateByExampleSelective(@Param("record") ExperienceBarrage record, @Param("example") ExperienceBarrageExample example);

    int updateByExample(@Param("record") ExperienceBarrage record, @Param("example") ExperienceBarrageExample example);

    int updateByPrimaryKeySelective(ExperienceBarrage record);

    int updateByPrimaryKey(ExperienceBarrage record);
}