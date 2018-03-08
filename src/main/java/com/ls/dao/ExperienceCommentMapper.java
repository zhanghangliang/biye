package com.ls.dao;

import com.ls.entity.ExperienceComment;
import com.ls.entity.ExperienceCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExperienceCommentMapper {
    int countByExample(ExperienceCommentExample example);

    int deleteByExample(ExperienceCommentExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(ExperienceComment record);

    int insertSelective(ExperienceComment record);

    List<ExperienceComment> selectByExample(ExperienceCommentExample example);

    ExperienceComment selectByPrimaryKey(Integer commentId);

    int updateByExampleSelective(@Param("record") ExperienceComment record, @Param("example") ExperienceCommentExample example);

    int updateByExample(@Param("record") ExperienceComment record, @Param("example") ExperienceCommentExample example);

    int updateByPrimaryKeySelective(ExperienceComment record);

    int updateByPrimaryKey(ExperienceComment record);
}