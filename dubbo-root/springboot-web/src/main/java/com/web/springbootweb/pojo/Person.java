package com.web.springbootweb.pojo;

import org.hibernate.validator.constraints.Range;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.validation.constraints.NotEmpty;

/**
 * @Author LiuYang
 * @Date 2021/2/26 10:36
 */
public class Person {

    @NotEmpty(message = "name不能为空")
    private String name;
    @Range(min = 0, max = 100, message = "age不能大于100小于0")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
