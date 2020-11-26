package com.wzfx.footmark.web.util;

/**
 * Created by wangweizhen on 2020/11/24.
 */
public final class StrUtil {

    /**
     * 判断ַ字符串是否为空， null或""均视为空
     *
     * @param value
     * @return
     */
    public static boolean isNullStr(String value) {
        return value == null || value.trim().equals("");
    }


    /**
     * 如果是null（包括"null"）转化为空串，否则返回原字符串
     *
     * @param str
     * @return
     */
    public static final String nullStringToEmptyString(String str) {
        return str == null || "null".equalsIgnoreCase(str) ? "" : str;
    }

    /**
     * 比较两个字符串是否相同，如果两个字符串为null或""或"null"均视为相同
     *
     * @param str1
     * @param str2
     * @return ��ͬΪtrue������false
     */
    public static boolean equalsNullIgnoreCase(String str1, String str2) {
        str1 = nullStringToEmptyString(str1);
        str2 = nullStringToEmptyString(str2);
        return str1.equals(str2);
    }

    /**
     * 判断ַ字符串是否为空, null或""或"null"均视为空
     *
     * @param value
     * @return
     */
    public static boolean isEquateNullStr(String value) {
        return equalsNullIgnoreCase(null, value);
    }

}
