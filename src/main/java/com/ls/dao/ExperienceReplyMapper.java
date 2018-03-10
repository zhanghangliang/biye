package com.ls.dao;

import com.ls.entity.ExperienceReply;
import com.ls.entity.ExperienceReplyExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceReplyMapper {
    int countByExample(ExperienceReplyExample example);

    int deleteByExample(ExperienceReplyExample example);

    int deleteByPrimaryKey(Integer replyId);

    int insert(ExperienceReply record);

    int insertSelective(ExperienceReply record);

    List<ExperienceReply> selectByExample(ExperienceReplyExample example);

    ExperienceReply selectByPrimaryKey(Integer replyId);

    int updateByExampleSelective(@Param("record") ExperienceReply record, @Param("example") ExperienceReplyExample example);

    int updateByExample(@Param("record") ExperienceReply record, @Param("example") ExperienceReplyExample example);

    int updateByPrimaryKeySelective(ExperienceReply record);

    int updateByPrimaryKey(ExperienceReply record);
}