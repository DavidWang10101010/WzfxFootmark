package com.wzfx.footmark.web.entity;

/**
 * @author wangweizhen
 * @description 单个操作的结果类
 * @date 2020/11/25 23:08
 */
public class OperateResult<T> extends RequestResult {

    private static final long serialVersionUID = 1L;

    /**
     * 返回值对象
     */
    private T data;

    public OperateResult() {
    }

    public OperateResult(BusinessObject obj, boolean success, String errorCode, String errorMsg) {
        super(success, errorCode, errorMsg);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
