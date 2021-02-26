package com.web.springbootweb.handle;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.springbootweb.pojo.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author LiuYang
 * @Date 2021/2/25 16:20
 *
 * 1、写一个全局的异常处理
 * 2、针对特定的场景的异常处理，比如数据异常
 */
@ControllerAdvice
public class GlobalExceptionHandle {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandle.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handlerException(Exception e) {
        logger.error(e.getMessage());

        return new ResultBean("faild", "网络繁忙！");
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public ResultBean validationErrorHandler(BindException ex) throws JsonProcessingException {

        //1、首先获取获取此处的BindResult
        BindingResult bindingResult = ex.getBindingResult();
        //2、获取错误信息
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        //3、创建存储错误信息map
        Map<String, String> message = new HashMap<String, String>();

        for (FieldError fieldError : fieldErrors) {

            message.put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper.writeValueAsString(message);

        return new ResultBean("400", json);
    }
}
