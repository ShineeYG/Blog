package com.lanou.controller;

import com.lanou.bean.Blog;
import com.lanou.bean.User;
import com.lanou.mapper.user.UserMapper;
import com.lanou.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yg on 17/8/23.
 */
@Controller
public class MainController {

    @Resource
    private UserService userService;


    //查找出所有的评论
    @RequestMapping("/findAllMessage")
    @ResponseBody
    public List<Blog> findAllMessage() {
        List<Blog> blogList = userService.findAllMessage();
        System.out.println(blogList);
        return blogList;
    }


    //登录界面
    @RequestMapping("/loginBlog")
    public String loginBlog(@RequestParam("name") String name,
                            @RequestParam("password") String password) {
        boolean b = userService.loginBlog(name, password);
        if (b) {
            return "success";
        } else {
            return "regiest";
        }
    }


    //注册
    @RequestMapping("/regiest")
    public String regiest(@RequestParam("name") String name, @RequestParam("password") String password,
                          @RequestParam("tel") String tel, @RequestParam("address") String address) {
        User user1 = new User();
        user1.setName(name);
        user1.setPassword(password);
        user1.setTel(tel);
        user1.setAddress(address);
        userService.regiest(user1);
        return "index";
    }


}
