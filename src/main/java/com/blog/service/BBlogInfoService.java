package com.blog.service;

import com.blog.pojo.BBlogInfo;

import java.util.List;

/**
 * Blog,service接口
 */
public interface BBlogInfoService {

    //删除Blog信息
    int deleteBlog(int id);

    //添加Blog信息
    int insertBlog(BBlogInfo bBlogInfo);

    //修改Blog信息
    int updateBlog(int id);

    //查询全部Blog信息
    List<BBlogInfo> selectAllBBlogInfo();

}
