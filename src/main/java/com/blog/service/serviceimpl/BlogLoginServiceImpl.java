package com.blog.service.serviceimpl;

import com.blog.mapper.BlogLoginMapper;
import com.blog.pojo.BBlogInfo;
import com.blog.pojo.BlogLogin;
import com.blog.service.BlogLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * BlogLogin,serviceimpl实现类
 */
@Service //service层实现类使用@service标注
public class BlogLoginServiceImpl implements BlogLoginService{

    @Autowired //使用@Autowired注入bean
    private BlogLoginMapper blogLoginMapper;

    @Override
    public List<BlogLogin> login(String username, String password) {

        List<BlogLogin> login = blogLoginMapper.login(username,password);

        return login;
    }

}
