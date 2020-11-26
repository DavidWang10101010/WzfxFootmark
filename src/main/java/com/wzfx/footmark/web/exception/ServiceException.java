package com.wzfx.footmark.web.exception;

/**
 * @author wangweizhen
 * @description 业务异常类
 * @date 2020/11/25 23:24
 */
public class ServiceException extends Exception {

    public ServiceException() {
        super();
    }

    public ServiceException(String msg) {
        super(msg);
    }

}
