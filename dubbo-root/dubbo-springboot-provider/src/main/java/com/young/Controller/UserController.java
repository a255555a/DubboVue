package com.young.Controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author LiuYang
 * @Date 2021/2/23 10:46
 */

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){

        return "hello,world!";
    }
}
