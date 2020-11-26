package com.wzfx.footmark.web.constants;

import com.wzfx.footmark.web.util.StrUtil;

/**
 * Created by wangweizhen on 2020/11/24.
 */
public enum LogicDelete {

    NORMAL("0", "正常"), LOGICDELETED("1", "逻辑删除");

    private String code;

    private String desc;

    LogicDelete(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }

}
