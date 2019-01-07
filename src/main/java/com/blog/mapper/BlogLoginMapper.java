package com.blog.mapper;

import com.blog.pojo.BlogLogin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogLoginMapper {

    //Blog登录
    List<BlogLogin> login(@Param("username")String username, @Param("password")String password);

    int insert(BlogLogin record);

    int insertSelective(BlogLogin record);
}