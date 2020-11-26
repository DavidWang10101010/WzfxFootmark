package com.wzfx.footmark.web.entity;

/**
 * @author wangweizhen
 * @description 请求类，是单个操作或批量操作结果类的父类
 * @date 2020/11/25 23:12
 */
public class RequestResult {

    private static final long serialVersionUID = 1L;

    /**
     * 操作结果 true:成功 false:失败
     */
    private boolean success = true;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误信息
     */
    private String errorMsg;

    public RequestResult() {
        this(true);
    }

    public RequestResult(boolean success) {
        this(success, null);
    }

    public RequestResult(boolean success, String errorCode) {
        this(success, errorCode, null);
    }

    public RequestResult(boolean success, String errorCode, String errorMsg) {
        this.success = success;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
