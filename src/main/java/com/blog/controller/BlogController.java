package com.blog.controller;

import com.blog.pojo.BBlogInfo;
import com.blog.pojo.BlogLogin;
import com.blog.service.BBlogInfoService;
import com.blog.service.BlogLoginService;
import com.blog.util.VaildateCodeUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * Blog,controller层
 */
@RestController //@RestController返回数据，@Controller返回数据到页面
public class BlogController {

    @Autowired
    private BBlogInfoService bBlogInfoService;

    @Autowired
    private BlogLoginService blogLoginService;

    //Blog测试接口
    @RequestMapping("/")
    public String test(){

        return "Test Blog-SpringBoot!";

    }

    //Blog查询全部信息接口
    @RequestMapping("selectAllBBlogInfo")
    public List<BBlogInfo> selectAllBBlogInfo(){

        List<BBlogInfo> bbilist = bBlogInfoService.selectAllBBlogInfo();

        return bbilist;

    }

    //Blog登录接口
    @RequestMapping("login")
    public String login(@Param("username")String username, @Param("password")String password){

        List<BlogLogin> login = blogLoginService.login(username,password);

        String token = UUID.randomUUID().toString().replace("-","");

        if(login.isEmpty()){

            return "用户名或密码错误！";

        }else{

            return  token;

        }

    }

    //修改Blog信息
    @RequestMapping("updateBlog")
    public String updateBlog(int id){

        int updateBlog = bBlogInfoService.updateBlog(id);

        if(updateBlog == 0){

            System.out.println();

            return "修改Blog信息出错！";

        }

        return "修改Blog信息成功！";

    }

    //添加Blog信息
    @RequestMapping("insertBlog")
    public String insertBlog(BBlogInfo bBlogInfo){

        int insertBlog = bBlogInfoService.insertBlog(bBlogInfo);

        if(insertBlog == 0){

            System.out.println();

            return "添加Blog信息出错！";

        }

        return "添加Blog信息成功！";

    }

    //删除Blog信息
    @RequestMapping("deleteBlog")
    public String deleteBlog(int id){

        int deleteBlog = bBlogInfoService.updateBlog(id);

        if(deleteBlog == 0){

            System.out.println();

            return "删除Blog信息出错！";

        }

        return "删除Blog信息出错！";

    }

    //删除Blog信息
    @RequestMapping("vaildateCode")
    public String vaildateCode(){

        VaildateCodeUtil vaildateCodeUtil = new VaildateCodeUtil(160,40,5,20);

        String code = vaildateCodeUtil.getCode();

        System.out.println("验证码是【" + code  + "】");

        return "验证码是： " + code;

    }

}
