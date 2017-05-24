package com.spearbothy.utils;

/**
 * Created by Alex_MaHao on 2017/5/24.
 */
public class StringUtil {

    public static boolean isEmpty(String str) {
        return str == null || str.equals("");
    }

    /**
     * 是否符合用户名规范
     */
    public static boolean isName(String name) {
        return !isEmpty(name) && name.length() >= 6 && name.length() <= 20;
    }

    /**
     * 是否符合密码规范
     */
    public static boolean isPassword(String password) {
        return !isEmpty(password) && password.length() >= 6 && password.length() <= 14;
    }
}
