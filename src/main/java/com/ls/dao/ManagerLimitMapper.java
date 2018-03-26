package com.ls.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ls.entity.ManagerInfo;

@Repository
public interface ManagerLimitMapper {
	List<ManagerInfo> selectManagerInfoByLimit(@Param("limit")Integer limit);
}
