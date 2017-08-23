package com.lanou.service;

import com.lanou.bean.Blog;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by yg on 17/8/23.
 */
@Service
public interface UserService {

    List<Blog> findAllMessage();

    boolean loginBlog(@RequestParam("name") String name,
                      @RequestParam("password") String password);

    void regiest(String name, String password, String tel, String address);
}
