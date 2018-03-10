package com.ls.dao;

import com.ls.entity.PostBarrage;
import com.ls.entity.PostBarrageExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostBarrageMapper {
    int countByExample(PostBarrageExample example);

    int deleteByExample(PostBarrageExample example);

    int insert(PostBarrage record);

    int insertSelective(PostBarrage record);

    List<PostBarrage> selectByExample(PostBarrageExample example);

    int updateByExampleSelective(@Param("record") PostBarrage record, @Param("example") PostBarrageExample example);

    int updateByExample(@Param("record") PostBarrage record, @Param("example") PostBarrageExample example);
}