package com.golive.base.util;

import org.apache.log4j.Logger;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtils {

    public static final int SECOND = 1000;
    public static final int MINUTE = SECOND * 60;
    public static final int HOUR = MINUTE * 60;
    public static final int DAY = HOUR * 24;
    public static final int WEEK = DAY * 7;
    public static final int YEAR = DAY * 365;
    Logger logger = Logger.getLogger(DateUtils.class);

    /**
     * 返回中文格式的当前时间
     *
     * @return [yyyy年MM月dd日 a hh:mm:ss]
     */
    public static String getChineseNow() {
        SimpleDateFormat formatter = new SimpleDateFormat(
                "yyyy年MM月dd日 a HH:mm:ss");
        Date nowc = new Date();
        String pid = formatter.format(nowc);
        return pid;
    }

    /**
     * 返回中文格式的当前日期
     *
     * @return [yyyy-mm-dd]
     */
    public static String getShortNow() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date nowc = new Date();
        String pid = formatter.format(nowc);
        return pid;
    }

    /**
     * 返回当天的日期
     *
     * @return [yyyyMMdd]
     */
    public static String getShortNow1() {
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        Date nowc = new Date();
        String pid = formatter.format(nowc);
        return pid;
    }

    /**
     * 返回短日期格式
     *
     * @return [yyyy-mm-dd]
     */
    public static String formatShort(String strDate) {
        String ret = "";
        if (strDate != null && !"1900-01-01 00:00:00.0".equals(strDate)
                && strDate.indexOf("-") > 0) {
            ret = strDate;
            if (ret.indexOf(" ") > -1)
                ret = ret.substring(0, ret.indexOf(" "));
        }
        return ret;
    }

    /**
     * 返回时间格式
     *
     * @return [hh-mi-ss]
     */
    public static String formatTime(String strDate) {
        String ret = "";
        if (strDate != null && !"1900-01-01 00:00:00.0".equals(strDate)) {
            ret = strDate;
            if (ret.indexOf(" ") > -1)
                ret = ret.substring(ret.indexOf(" ") + 1, ret.length());

        }
        return ret;
    }

    /**
     * 返回时间格式
     *
     * @return [hh-mi]
     */
    public static String formatShortTime(String strDate) {
        String ret = "";
        if (strDate != null && !"1900-01-01 00:00:00.0".equals(strDate)) {
            ret = strDate;
            if (ret.indexOf(" ") > -1)
                ret = ret.substring(ret.indexOf(" ") + 1, 16);

        }
        return ret;
    }

    /**
     * 返回标准格式的当前时间
     *
     * @return [yyyy-MM-dd hh:mm:ss]
     */
    public static String getNow() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date nowc = new Date();
        String pid = formatter.format(nowc);
        return pid;
    }

    public static Date getNowDate() {
        Date nowc = new Date();
        return nowc;
    }

    /**
     * 返回中文格式的当前日期
     *
     * @return [yyyymmdd]
     */
    public static String getNoBeepNow() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        Date nowc = new Date();
        String pid = formatter.format(nowc);
        return pid;
    }

    /**
     * 返回当前年份
     *
     * @return [yyyy]
     */

    public static String getYear() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        Date nowc = new Date();
        String pid = formatter.format(nowc);
        return pid;
    }

    /**
     * 返回当前月份
     *
     * @return [MM]
     */

    public static String getMonth() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM");
        Date nowc = new Date();
        String pid = formatter.format(nowc);
        return pid;
    }

    /**
     * 返回当前日
     *
     * @return [dd]
     */

    public static String getDay() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd");
        Date nowc = new Date();
        String pid = formatter.format(nowc);
        return pid;
    }

    /**
     * 返回当前时间24小时制式
     *
     * @return [H:mm:ss]
     */

    public static String getTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("H:mm:ss");
        Date nowc = new Date();
        String pid = formatter.format(nowc);
        return pid;
    }

    /**
     * 返回当前时间24小时制式
     *
     * @return [H:mm]
     */

    public static String getTimeBykm() {
        SimpleDateFormat formatter = new SimpleDateFormat("H:mm");
        Date nowc = new Date();
        String pid = formatter.format(nowc);
        return pid;
    }

    /**
     * 格式化中文日期短日期格式
     *
     * @param gstrDate 输入欲格式化的日期
     * @return [yyyy年MM月dd日]
     */

    public static String formatShortDateC(Date gstrDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日");
        @SuppressWarnings("unused")
        Date nowc = new Date();
        String pid = formatter.format(gstrDate);
        return pid;
    }

    /**
     * 格式化中文日期长日期格式
     *
     * @param gstrDate 输入欲格式化的日期
     * @return [yyyy年MM月dd日 H:mm:ss]
     */

    public static String formatLongDateC(Date gstrDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(
                "yyyy年MM月dd日 HH:mm:ss");
        @SuppressWarnings("unused")
        Date nowc = new Date();
        String pid = formatter.format(gstrDate);
        return pid;
    }

    /**
     * 格式化标准日期短日期格式
     *
     * @param gstrDate 输入欲格式化的日期
     * @return [yyyy-MM-dd]
     */
    public static String formatShortDate(Date gstrDate) {
        if (null == gstrDate || "".equals(gstrDate)) {
            return "";
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        String pid = formatter.format(gstrDate);
        return pid;
    }

    public static String formatDateTimeToString(Date srcDate) {
        if (null == srcDate || "".equals(srcDate)) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss", Locale.CHINA);
        return sdf.format(srcDate);
    }

    /**
     * 格式化标准日期长日期格式
     *
     * @param gstrDate 输入欲格式化的日期
     * @return [yyyy-MM-dd H:mm:ss]
     */
    public static String formatLongDate(Date gstrDate) {
        if (null == gstrDate) {
            return "";
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String pid = formatter.format(gstrDate);
        return pid;
    }

    public static String formatTimeToString(Date srcDate) {
        if (null == srcDate) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm", Locale.CHINA);
        return sdf.format(srcDate);
    }

    /**
     * 格式化用户定义的日期格式
     *
     * @param gstrDate 输入欲格式化的日期
     * @param gstrType 用户自定义的日期格式
     * @return [用户定义格式的日期]
     */
    public static String formatDateType(Date gstrDate, String gstrType) {
        SimpleDateFormat formatter = new SimpleDateFormat(gstrType);
        @SuppressWarnings("unused")
        Date nowc = new Date();
        String pid = formatter.format(gstrDate);
        return pid;
    }

    /**
     * 格式化字符串为Date类型
     *
     * @param strdate 字符串
     * @return 格式化后的Date
     */
    public static Date getDate(String strdate) {
        return java.sql.Date.valueOf(strdate);
    }

    /**
     * 格式化字符串为Date类型
     *
     * @param strdatetime 字符串,"yyyy-mm-dd hh:mi:ss"
     * @return 格式化后的Date
     */
    public static Date getDateTime(String strdatetime) {
        return java.sql.Timestamp.valueOf(strdatetime);
    }

    /**
     * 比较两个日期，精确到天。
     *
     * @param d1 日期1
     * @param d2 日期2
     * @return 比较结果
     * <p>
     * 0 d1=d2
     * </p>
     * <p>
     * 1 d1>d2
     * </p>
     * <p>
     * -1 d1小于d2
     * </p>
     */
    public static int compareToByDay(Date d1, Date d2) {
        return DateUtils.formatShortDate(d1).compareTo(
                DateUtils.formatShortDate(d2));
    }

    public static int compareToByDayForLong(Date d1, Date d2) {
        return DateUtils.formatLongDateC(d1).compareTo(
                DateUtils.formatLongDateC(d2));
    }

    /**
     * 在当前日期上添加days的天数
     *
     * @param srcdate
     * @param days
     * @return
     */
    public static Date addByDate(Date srcdate, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(srcdate);
        calendar.add(Calendar.DATE, days);
        return calendar.getTime();
    }

    /**
     * 在当前日期上添加years的年数
     *
     * @param srcdate
     * @param years
     * @return
     */
    public static Date addByYears(Date srcdate, int years) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(srcdate);
        calendar.add(Calendar.YEAR, years);
        return calendar.getTime();
    }

    public static Date addMinutes(Date srcdate, int minutes) {
        if (null == srcdate) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(srcdate);
        calendar.add(Calendar.MINUTE, minutes);
        return calendar.getTime();
    }

    /**
     * 格式化字符串为Date类型
     *
     * @param strdatetime 字符串,"yyyy-MM-dd hh:mi:ss"
     * @return 格式化后的Date
     */
    @SuppressWarnings("static-access")
    public static java.sql.Date stringToSqlDate(String strdatetime)
            throws Exception {
        java.sql.Date date = null;
        try {
            if (strdatetime == null || strdatetime.trim().length() < 1)
                return null;
            date = date.valueOf(strdatetime);
        } catch (Exception e) {
            throw new Exception("非法的时间格式,应该是yyyy-MM-dd");
        }
        return date;
    }

    /**
     * 将yyyymmdd格式转换为yyyy-mm-dd格式
     */
    public static String formatNormal(String sDate) {
        if (sDate != null && sDate.length() == 8) {
            sDate = sDate.substring(0, 4) + "-" + sDate.substring(4, 6) + "-"
                    + sDate.substring(6);
        }
        return sDate;
    }

    /**
     * 将字符串格式转换为sqldate
     *
     * @throws Exception
     */
    public static java.sql.Date getSqlDate(String stime) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        java.sql.Date sqlDate = null;
        try {
            Date date = sdf.parse(stime);
            sqlDate = new java.sql.Date(date.getTime());
        } catch (Exception e) {
            throw new Exception("时间转换出现异常，请检查时间格式。");
        }
        return sqlDate;
    }

    /**
     * 返回中文格式的当前时间
     *
     * @return [yyyy年MM月dd日 a hh时mm分ss秒]
     */
    public static String getChineseTime() {
        SimpleDateFormat formatter = new SimpleDateFormat(
                "yyyy年MM月dd日 a HH时mm分ss秒");
        Date nowc = new Date();
        String pid = formatter.format(nowc);
        return pid;
    }

    /**
     * 获取date日期后的n天的日期
     *
     * @param date
     * @param n
     * @return
     */
    public static String getSomeday(String date, int n) {

        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date oneday = null;
        try {
            oneday = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar ca = Calendar.getInstance();
        ca.setTime(oneday);
        ca.set(Calendar.DAY_OF_YEAR, ca.get(Calendar.DAY_OF_YEAR) + n);
        Date somday = new Date(ca.getTimeInMillis());

        return format.format(somday);

    }

    /**
     * 获取date日期后的n天的日期
     *
     * @param date
     * @param n
     * @return
     */
    public static String getSomeTimeday(String date, int n) {

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date oneday = null;
        try {
            oneday = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar ca = Calendar.getInstance();
        ca.setTime(oneday);
        ca.set(Calendar.DAY_OF_YEAR, ca.get(Calendar.DAY_OF_YEAR) + n);
        Date somday = new Date(ca.getTimeInMillis());

        return format.format(somday);

    }

    /**
     * 返回明天的日期
     *
     * @return yyyyMMdd
     */
    public static String getNextDay() {
        Calendar ca = Calendar.getInstance();
        ca.setTime(new Date());
        ca.set(Calendar.DAY_OF_YEAR, ca.get(Calendar.DAY_OF_YEAR) + 1);
        Date dt = new Date(ca.getTimeInMillis());
        DateFormat ft = new SimpleDateFormat("yyyyMMdd");
        String nextDay = ft.format(dt);
        return nextDay;
    }

    /**
     * 获取给定时间和当前时间的间隔天数
     *
     * @param date yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static int getDays(Date date) {
        if (date.after(new Date())) {
            Calendar ca = Calendar.getInstance();
            long currDays = ca.getTimeInMillis();
            ca.setTime(date);
            long givenDays = ca.getTimeInMillis();
            int dis = (int) ((givenDays - currDays) / (24 * 3600 * 1000)) + 1;
            System.out.println(dis);
            return dis;
        }
        return 0;
    }

    /**
     * 获取给定时间和当前时间的间隔天数
     *
     * @param date yyyy-MM-dd
     * @return
     * @throws ParseException
     */
    public static int getDay(Date date) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date now = null;
        try {
            now = df.parse(df.format(new Date()));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (date.after(now)) {
            Calendar ca = Calendar.getInstance();
            ca.setTime(now);
            long currDays = ca.getTimeInMillis();
            ca.setTime(date);
            long givenDays = ca.getTimeInMillis();
            int dis = (int) ((givenDays - currDays) / (24 * 3600 * 1000));
            return dis;
        }
        return 0;
    }

    /**
     * 根据字符串日期 datestr, 日期模板获得 Date 时间
     *
     * @param datestr
     * @param format  如:yyyyMMdd,yyyy-MM-dd
     * @return
     */
    public static Date stringToDateMain(String datestr, String format) {
        if (null == datestr || datestr.equals(""))
            return null;
        if (0 < datestr.indexOf("CST") || 0 < datestr.indexOf("GMT")) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy",
                        Locale.US);
                Date d = sdf.parse(datestr);
                return d;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.CHINA);
        try {
            return sdf.parse(datestr);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取两个时间之间的分钟数
     *

     * @return
     */
    public static int getMinute(Date startDate, Date endDate) {
        if (null == startDate || null == endDate)
            return 0;
        return Long.valueOf((endDate.getTime() - startDate.getTime()) / MINUTE).intValue();
    }

    /**
     * 获取两个时间之间的分钟数
     *

     * @return
     */
    public static int getHours(Date startDate, Date endDate) {
        if (null == startDate || null == endDate)
            return 0;
        return Long.valueOf((endDate.getTime() - startDate.getTime()) / HOUR).intValue();
    }

    public static String getDateString(Date date, String offset) throws ParseException {
        if (null == date || null == date)
            return "";
        String offsetStr = "-00:00";
        if (null != offset && !"".equals(offset)) {
            offsetStr = offset;
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS" + offsetStr);
        Date nowc = new Date();
        return df.format(nowc);
    }

    public static String getDateStringByArea(Date date, String areaCode) throws ParseException {
        if (null == date || null == date)
            return "";
        String offsetStr = "-00:00";
        String offsetTime = "0";
        int offset = DateTools.getAreaTimeOffset(areaCode);// 得到与格林威治时间相差小时
        offsetTime = offset + "";
        if (offset >= 0) {
            if (offsetTime.length() == 1) {
                offsetStr = "+0" + offset + ":00";
            } else {
                offsetStr = "+" + offset + ":00";
            }
        } else {
            if (offsetTime.length() == 2) {
                offsetTime = offsetTime.substring(1, offsetTime.length());
                offsetStr = "-0" + offset + ":00";
            } else {
                offsetStr = offset + ":00";
            }
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS" + offsetStr);
        //Date nowc = new Date();
        return df.format(date);
    }

    public static int getWeek() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        return 0 == (cal.get(Calendar.DAY_OF_WEEK) - 1) ? 7 : cal
                .get(Calendar.DAY_OF_WEEK) - 1;
    }

    public static void main(String[] arg) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS+08:00");
        Date nowc = new Date();
        String pid = df.format(nowc);
        System.out.println(pid);

        System.out.println(DateUtils.getWeek());


        //System.out.println(DateTools.getAreaTimeOffset("US"));
    }
}
