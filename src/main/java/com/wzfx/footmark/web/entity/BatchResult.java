package com.wzfx.footmark.web.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangweizhen
 * @description 批量操作的结果类
 * @date 2020/11/25 23:11
 */
public class BatchResult<T> extends RequestResult {

    private static final long serialVersionUID = 1L;

    /**
     * 操作成功结果列表
     */
    private List<OperateResult<T>> successList = new ArrayList<OperateResult<T>>();


    /**
     * 操作失败结果列表
     */
    private List<OperateResult<T>> failedList = new ArrayList<OperateResult<T>>();

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void addSuccess(OperateResult<T> success) {
        successList.add(success);
    }

    public void addFailed(OperateResult<T> failed) {
        failedList.add(failed);
    }

    public List<OperateResult<T>> getSuccessList() {
        return successList;
    }

    public void setSuccessList(List<OperateResult<T>> successList) {
        this.successList = successList;
    }

    public List<OperateResult<T>> getFailedList() {
        return failedList;
    }

    public void setFailedList(List<OperateResult<T>> failedList) {
        this.failedList = failedList;
    }
}
