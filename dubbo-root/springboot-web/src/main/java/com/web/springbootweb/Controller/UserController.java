package com.web.springbootweb.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.web.springbootweb.config.Resource;
import com.web.springbootweb.pojo.Person;
import com.web.springbootweb.pojo.ResultBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author LiuYang
 * @Date 2021/2/23 10:53
 */
@Controller
@RequestMapping("user")
@Slf4j
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

    /**
     * 数据校验
     * @param person
     * @param bindingResult
     * @return
     */
    @RequestMapping("test")
    @ResponseBody
    public String valid(@Validated Person person, BindingResult bindingResult) {
        //数据校验
        if (bindingResult.hasErrors()) {
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                System.out.println(fieldError);
                String field = fieldError.getField();
                String message = fieldError.getDefaultMessage();
                log.error("[{}]:[{}]",field,message);
            }
            return "fail";
        }
        return "success";
    }

    @RequestMapping("filter")
    @ResponseBody
    public ResultBean filterMethod(@Validated Person person) throws JsonProcessingException {
        //数据校验
        /**
         * AOP将核心业务逻辑和非核心业务逻辑分离
         * 1、核心业务逻辑
         * 2、非核心业务逻辑
         * AOP的应用场景就是事务和业务逻辑
         */

        log.info("模拟数据！");
        return new ResultBean("success","ok");
    }

}
