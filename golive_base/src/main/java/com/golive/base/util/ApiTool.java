package com.golive.base.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;
import java.util.UUID;


/**
 * @author wuzhping
 * @date 2013-11-23
 */
public class ApiTool {
    protected static final Log logger = LogFactory.getLog(ApiTool.class);

    /**
     * write xml to terminal
     *
     * @param data
     * @param response
     * @throws Exception
     */
    public static void write(String data, String contentType, HttpServletResponse response) throws Exception {
        response.setHeader("Access-Control-Allow-Origin", "*");    //支持跨域访问
        //response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS");
        //response.setHeader("Access-Control-Allow-Headers", "Content-Type,Accept");
        response.setContentType(contentType);
        byte[] xmldata = data.getBytes("utf-8");
        response.setContentLength(xmldata.length);
        ServletOutputStream output = response.getOutputStream();
        output.write(xmldata);
        output.flush();
        output.close();
    }

    public static String postHttpData(String data, String postUrl) throws Exception {
        OutputStream out = null;
        InputStream in = null;
        BufferedReader br = null;
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(postUrl);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setDoOutput(true);// 是否输入参数
            httpURLConnection.setDoInput(true);// 是否接收参数
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("content-type", "text/xml;charset=UTF-8");
            httpURLConnection.setRequestProperty("Accept-Language", "zh-cn");
            out = httpURLConnection.getOutputStream();
            out.write(data.getBytes("UTF-8"));
            out.flush();

            in = httpURLConnection.getInputStream();
            httpURLConnection.getResponseMessage();

            StringBuilder sb = new StringBuilder();
            if (200 == httpURLConnection.getResponseCode()) {
                br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
                String readLine = null;
                while ((readLine = br.readLine()) != null) {
                    sb.append(readLine);
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException("连接" + postUrl + "错误：", e);
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (null != br) {
                    br.close();
                }
                if (null != in) {
                    in.close();
                }
                if (null != httpURLConnection) {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void write(String data, HttpServletResponse response) throws Exception {
        write(data, "text/xml;charset=utf-8", response);
    }

    public static void writeJson(String data, HttpServletResponse response) throws Exception {
        write(data, "application/json;charset=utf-8", response);
    }

    /**
     * write text to terminal
     *
     * @param data
     * @param response
     * @throws Exception
     */
    public static void writeText(String data, HttpServletResponse response) throws Exception {
        write(data, "text/html;charset=utf-8", response);
    }

    /**
     * generate livetoken string
     * length  32
     *
     * @return
     */
    public static String generateLivetoken() {
        UUID uuid = UUID.randomUUID();
        String livetoken = MD5.encode(uuid.toString());
        return livetoken;
    }

    /**
     * generate validatecode
     * length 6
     *
     * @return
     */
    public static String generateCode(int length) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random rand = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = Math.abs(rand.nextInt(10));
            result.append(array[index]);
        }
        return result.toString();
    }

    /**
     * mail content
     *
     * @param code
     * @return
     */
    public static String getMailContent(String code) {
        String content = "<div style=\"font-family: monospace;\">" +
                "      尊敬的用户您好！感谢您注册全球播大剧院服务，以下是您本次注册的验证码：" + code + "<br>" +
                "      该验证码5分钟以后失效，请您不要泄露该验证码，及时完成注册。谢谢！" +
                "  </div>";
        return content;
    }

    public static String getMailContentForForgetPwd(String code) {
        String content = "<div style=\"font-family: monospace;\">" +
                "      尊敬的用户您好！感谢您使用全球播大剧院服务，以下是您的验证码：" + code + "<br>" +
                "      请您不要泄露该验证码。该验证码5分钟以后失效。请及时输入验证码，并设置新的密码，谢谢！" +
                "  </div>";
        return content;
    }

    public static String getMailContentForSendPwd(String code) {
        String content = "<div style=\"font-family: monospace;\">" +
                "      尊敬的用户您好！感谢您使用全球播大剧院服务，以下是您的登录密码：" + code + "<br>" +
                "      请注意保密，避免泄露！谢谢！" +
                "  </div>";
        return content;
    }

    /**
     * get common response xml
     *
     * @param url  api url
     * @param code OwnException code
     * @return
     */
    public static String getCommonResXml(String url, String code) {
        String bool = code.equals("") ? "false" : "true";
        StringBuilder data = new StringBuilder();
        data.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n")
                .append("<response website=\"" + url + "\">\n")
                .append("     <error type=\"").append(bool).append("\" note=\"").append(code).append("\" servertime=\"").append(DateHelper.getNow()).append("\"/>\n")
                .append("</response>");
        return data.toString();
    }


    public static String getFilmFormat(int fileFormat) {
        String format = "ts";
        if (fileFormat == 0)
            format = "wmv";
        if (fileFormat == 1)
            format = "rmvb";
        if (fileFormat == 2)
            format = "ts";
        if (fileFormat == 3)
            format = "itv";
        if (fileFormat == 4)
            format = "flv";
        if (fileFormat == 5)
            format = "mp4";
        return format;
    }

    /**
     * public static String getAreaCodeByIp(String ip, List<IpTable> ipTables) {
     * String areaCode = null;
     * long ipnum = Tool.ipToInt(ip);
     * for (int i = 0; i < ipTables.size(); i++) {
     * IpTable iptable = ipTables.get(i);
     * if (ipnum >= iptable.getBeginip() && ipnum <= iptable.getEndip()) {
     * areaCode = iptable.getArea();
     * break;
     * }
     * }
     * return areaCode;
     * }
     */

    public static String getStreamSource(String streamSource) {
        String ss = "2";
        if (streamSource != null && !"".equals(streamSource)) {
            if ("0".equals(streamSource)) {
                ss = streamSource;
            } else if ("1".equals(streamSource) || "2".equals(streamSource)) {
                ss = "1";
            } else if ("3".equals(streamSource)) {
                ss = "3";
            } else {
                ss = "2";
            }
        }
        return ss;
    }

    /**
     * 生成livekey 8位
     *
     * @param key_len
     * @return
     */
    public static String getKey(int key_len) {
        final int maxNum = 36;
        int i;  //生成的随机数
        int count = 0; //生成的密码的长度
        char[] str = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        StringBuffer key = new StringBuffer("");
        Random r = new Random();
        while (count < key_len) {
            //生成随机数，取绝对值，防止生成负数，
            i = Math.abs(r.nextInt(maxNum));  //生成的数最大为36-1
            if (i >= 0 && i < str.length) {
                key.append(str[i]);
                count++;
            }
        }
        return key.toString();
    }

    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    public static String replaceWebsiteAndPort(String website, String port, String url) {
        String url_bak = "";
        if (url != null && !"".equals(url)) {
            if (url.indexOf("//") != -1) {
                String[] splitTemp = url.split("//");
                url_bak = splitTemp[0] + "//";
                if (website.indexOf("//") != -1) {        //包含HTTP://
                    url_bak = website;
                } else {
                    url_bak = url_bak + website;
                }

                if (port != null) {
                    url_bak = url_bak + ":" + port;
                }

                if (splitTemp.length >= 1 && splitTemp[1].indexOf("/") != -1) {
                    String[] urlTemp2 = splitTemp[1].split("/");
                    if (urlTemp2.length > 1) {
                        for (int i = 1; i < urlTemp2.length; i++) {
                            url_bak = url_bak + "/" + urlTemp2[i];
                        }
                    }
                }
            }
        }
        return url_bak;
    }
}
