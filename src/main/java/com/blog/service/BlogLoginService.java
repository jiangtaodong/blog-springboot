package com.blog.service;

import com.blog.pojo.BlogLogin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * BlogLogin,service接口
 */
public interface BlogLoginService {

    //Blog登录
    List<BlogLogin> login(@Param("username")String username, @Param("password")String password);

}
