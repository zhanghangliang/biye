package com.ls.dao;

import com.ls.entity.UserFocus;
import com.ls.entity.UserFocusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFocusMapper {
    int countByExample(UserFocusExample example);

    int deleteByExample(UserFocusExample example);

    int insert(UserFocus record);

    int insertSelective(UserFocus record);

    List<UserFocus> selectByExample(UserFocusExample example);

    int updateByExampleSelective(@Param("record") UserFocus record, @Param("example") UserFocusExample example);

    int updateByExample(@Param("record") UserFocus record, @Param("example") UserFocusExample example);
}