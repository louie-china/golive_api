package com.golive.base.util;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DateTools {

    private static Map<String, Integer> offsetMap = new HashMap<String, Integer>();

    public static void setOffsetMap(Map<String, Integer> offsetMap) {
        DateTools.offsetMap = offsetMap;
    }

    /**
     * 通过地区代码得到该地区与格林威治时间的时间差
     *
     * @param areaCode 地区代码
     * @return
     */
    public static int getAreaTimeOffset(String areaCode) {
        if (areaCode != null && !"".equals(areaCode) && offsetMap != null) {
            return (offsetMap.get(areaCode) == null ? 0 : offsetMap.get(areaCode));
        }
        return 0;
    }

    /**
     * 将指定地区时间转换成格林威治时间
     *
     * @param date     需要转换的时间
     * @param areaCode 转换时间的地区，通过该地区得到与格林威治时间的时差
     * @return
     * @throws ParseException
     */
    public static Date getGreenwichTime(Date date, String areaCode) {
        if (null == date) {
            return null;
        }
        int offset = getAreaTimeOffset(areaCode);// 得到与格林威治时间相差小时
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, -offset);
        return cal.getTime();
    }


    /**
     * 将格林威治时间转换指定地区时间
     *
     * @param formatDate 需要转换的时间
     * @param format     转换时间的字符串格式
     * @param areaCode   转换时间的地区，通过该地区得到与格林威治时间的时差
     * @return
     * @throws ParseException
     */
    public static Date getTargetTime(Date date, String areaCode) {
        if (null == date) {
            return null;
        }
        int offset = getAreaTimeOffset(areaCode);// 得到与格林威治时间相差小时
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, offset);
        return cal.getTime();
    }

}