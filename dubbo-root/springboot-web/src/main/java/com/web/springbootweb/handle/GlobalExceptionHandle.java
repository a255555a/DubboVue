package com.web.springbootweb.handle;

import com.web.springbootweb.pojo.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.transform.Result;

/**
 * @Author LiuYang
 * @Date 2021/2/25 16:20
 */
@ControllerAdvice
public class GlobalExceptionHandle {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandle.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handlerException(Exception e) {
        logger.error(e.getMessage());

        return new ResultBean("faild","网络繁忙！");
    }
}
