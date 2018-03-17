package com.ls.dao;

import com.ls.entity.UserDetailInfo;
import com.ls.entity.UserDetailInfoExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailInfoMapper {
    int countByExample(UserDetailInfoExample example);

    int deleteByExample(UserDetailInfoExample example);

    int insert(UserDetailInfo record);

    int insertSelective(UserDetailInfo record);

    List<UserDetailInfo> selectByExampleWithBLOBs(UserDetailInfoExample example);

    List<UserDetailInfo> selectByExample(UserDetailInfoExample example);

    int updateByExampleSelective(@Param("record") UserDetailInfo record, @Param("example") UserDetailInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") UserDetailInfo record, @Param("example") UserDetailInfoExample example);

    int updateByExample(@Param("record") UserDetailInfo record, @Param("example") UserDetailInfoExample example);
    
    //add
    int updateByUseridAndWhich(@Param("which")String which,@Param("photo")String photo,@Param("userid")Integer userid);
}