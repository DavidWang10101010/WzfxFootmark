package com.wzfx.footmark.web.constants;

/**
 * @author wangweizhen
 * @description 错误码类
 * @date 2020/11/25 23:25
 */
public enum ErrorCode {

    UNKNOWN_EXCEPTION("UNKNOWN_EXCEPTION", "程序未知异常"),
    DATABASE_EXCEPTION("DATABASE_EXCEPTION", "数据库异常");

    private String code;

    private String desc;

    ErrorCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }

    public static String getErrorMsg(String errorCode) {
        if (errorCode == null) {return null;}
        ErrorCode[] values = values();
        for (ErrorCode errClazz:values) {
            return errorCode.equalsIgnoreCase(errClazz.code)?errClazz.desc:null;
        }
        return UNKNOWN_EXCEPTION.desc;
    }

    public static void main(String[] args) {
        String message = ErrorCode.getErrorMsg("UNKNOWN_EXCEPTION");
        System.out.println(message);
    }
}
