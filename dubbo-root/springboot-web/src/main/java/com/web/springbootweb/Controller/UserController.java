package com.web.springbootweb.Controller;

import com.web.springbootweb.config.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author LiuYang
 * @Date 2021/2/23 10:53
 */
@Controller
@RequestMapping("user")
public class UserController {


    @Autowired
    private Resource resource;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){

        return "hello,world!!hello,dubbo!!!";
    }
    @GetMapping("getImage")
    @ResponseBody
    public String getImageServer(){

        return resource.getImageServer();
    }
}
