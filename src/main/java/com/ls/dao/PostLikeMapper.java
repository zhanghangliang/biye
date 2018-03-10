package com.ls.dao;

import com.ls.entity.PostLike;
import com.ls.entity.PostLikeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostLikeMapper {
    int countByExample(PostLikeExample example);

    int deleteByExample(PostLikeExample example);

    int insert(PostLike record);

    int insertSelective(PostLike record);

    List<PostLike> selectByExample(PostLikeExample example);

    int updateByExampleSelective(@Param("record") PostLike record, @Param("example") PostLikeExample example);

    int updateByExample(@Param("record") PostLike record, @Param("example") PostLikeExample example);
}