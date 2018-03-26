package com.ls.dao;

import com.ls.entity.PostBaseInfo;
import com.ls.entity.PostBaseInfoExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostBaseInfoMapper {
    int countByExample(PostBaseInfoExample example);

    int deleteByExample(PostBaseInfoExample example);

    int deleteByPrimaryKey(Integer postId);

    int insert(PostBaseInfo record);

    int insertSelective(PostBaseInfo record);

    List<PostBaseInfo> selectByExampleWithBLOBs(PostBaseInfoExample example);

    List<PostBaseInfo> selectByExample(PostBaseInfoExample example);

    PostBaseInfo selectByPrimaryKey(Integer postId);

    int updateByExampleSelective(@Param("record") PostBaseInfo record, @Param("example") PostBaseInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") PostBaseInfo record, @Param("example") PostBaseInfoExample example);

    int updateByExample(@Param("record") PostBaseInfo record, @Param("example") PostBaseInfoExample example);

    int updateByPrimaryKeySelective(PostBaseInfo record);

    int updateByPrimaryKeyWithBLOBs(PostBaseInfo record);

    int updateByPrimaryKey(PostBaseInfo record);
    
    List<PostBaseInfo> selectPostBaseInfoByLimit(@Param("arg1") String arg1,@Param("arg2")Integer arg2);
}