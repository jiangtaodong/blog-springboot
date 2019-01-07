package com.blog.mapper;

import com.blog.pojo.BBlogInfo;

import java.util.List;

public interface BBlogInfoMapper {

    //删除Blog信息
    int deleteBlog(int id);

    //添加Blog信息
    int insertBlog(BBlogInfo bBlogInfo);

    //修改Blog信息
    int updateBlog(int id);

    //查询全部Blog信息
    List<BBlogInfo> selectAllBBlogInfo();

    int insert(BBlogInfo record);

    int insertSelective(BBlogInfo record);
}