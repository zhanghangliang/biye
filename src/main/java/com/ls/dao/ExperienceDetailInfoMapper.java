package com.ls.dao;

import com.ls.entity.ExperienceDetailInfo;
import com.ls.entity.ExperienceDetailInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExperienceDetailInfoMapper {
    int countByExample(ExperienceDetailInfoExample example);

    int deleteByExample(ExperienceDetailInfoExample example);

    int insert(ExperienceDetailInfo record);

    int insertSelective(ExperienceDetailInfo record);

    List<ExperienceDetailInfo> selectByExample(ExperienceDetailInfoExample example);

    int updateByExampleSelective(@Param("record") ExperienceDetailInfo record, @Param("example") ExperienceDetailInfoExample example);

    int updateByExample(@Param("record") ExperienceDetailInfo record, @Param("example") ExperienceDetailInfoExample example);
}