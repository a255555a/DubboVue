package com.web.springbootweb.pojo;


import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @Author LiuYang
 * @Date 2021/2/25 16:18
 */
@Data
public class ResultBean<T> {

    /**
     * 做一个全局异常处理
     */

    private String status;

    private T data;

    public ResultBean(String status, T data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
