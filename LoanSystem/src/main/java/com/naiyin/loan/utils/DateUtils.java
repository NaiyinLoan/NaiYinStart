package com.naiyin.loan.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转换工具类
 */
public class DateUtils {
    /**
     * 时间转换为字符串
     * @param date  时间
     * @param pattrn    如模式 yyyy-MM-dd 或者 yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String DataToString(Date date, String pattrn){
        SimpleDateFormat sdf = new SimpleDateFormat(pattrn);
        String format = sdf.format(date);
        return format;
    }

    /**
     * 字符串转换为时间
     * @param format 字符串
     * @param pattrn 模式
     * @return
     */
    public static Date StringToDate(String format, String pattrn){
        SimpleDateFormat sdf = new SimpleDateFormat(pattrn);
        Date date = null;
        try {
            date = sdf.parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
