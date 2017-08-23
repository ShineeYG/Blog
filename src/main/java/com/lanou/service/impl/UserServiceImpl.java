package com.lanou.service.impl;

import com.lanou.bean.Blog;
import com.lanou.bean.User;
import com.lanou.mapper.user.UserMapper;
import com.lanou.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yg on 17/8/23.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    public List<Blog> findAllMessage() {
        List<Blog> allMessage = userMapper.findAllMessage();
        return allMessage;
    }

    public boolean loginBlog(@Param("name") String name,
                             @Param("password") String password) {

        System.out.println(name + "走到这了  走丢了" + password);
        User user1 = userMapper.loginBlog(name, password);
        if (user1 != null) {
            return false;
        } else {
            return true;
        }
    }

    public void regiest(String name, String password, String tel, String address) {
        System.out.println("name:" + name + "password:" + password + "tel:" + tel + "address:" + address);
        name = "2";
        password = "2";
        tel = "2";
        address = "2";
        System.out.println("name:" + name + "password:" + password + "tel:" + tel + "address:" + address);
        userMapper.regiest(name, password, tel, address);
    }


}
