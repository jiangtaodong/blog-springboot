package com.blog.service.serviceimpl;

import com.blog.mapper.BBlogInfoMapper;
import com.blog.pojo.BBlogInfo;
import com.blog.service.BBlogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Blog,serviceimpl实现类
 */
@Service //service层实现类用@Service标注
public class BBlogInfoServiceImpl implements BBlogInfoService {

    @Autowired //使用@Autowired注入bean
    private BBlogInfoMapper bBlogInfoMapper;

    @Override
    public int deleteBlog(int id) {

        int deleteBlog = bBlogInfoMapper.deleteBlog(id);

        return deleteBlog;
    }

    @Override
    public int insertBlog(BBlogInfo bBlogInfo) {

        int insertBlog = bBlogInfoMapper.insertBlog(bBlogInfo);

        return insertBlog;
    }

    @Override
    public int updateBlog(int id) {

        int updateBlog = bBlogInfoMapper.updateBlog(id);

        return updateBlog;
    }

    @Override
    public List<BBlogInfo> selectAllBBlogInfo() {

        List<BBlogInfo> bbilist = bBlogInfoMapper.selectAllBBlogInfo();

        return bbilist;
    }
}
