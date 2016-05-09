package com.golive.base.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * ****************************************************************************
 * md5 类实现了RSA Data Security, Inc.在提交给IETF 的RFC1321中的MD5 message-digest 算法。
 * ****************************************************************************
 */
public class MD5 {
    protected static final Log logger = LogFactory.getLog(MD5.class);

    /**
     * 用MD5算法加密
     *
     * @param in String : 待加密的原文
     * @return String : 加密后的密文，如果原文为空，则返回null;
     */
    public static String encode(final String in) {
        return encode(in, "");
    }

    /**
     * 用MD5算法加密
     *
     * @param in      String : 待加密的原文
     * @param charset String : 加密算法字符集
     * @return String : 加密后的密文，若出错或原文为null，则返回null
     */
    public static String encode(final String in, final String charset) {
        if (in == null) return null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            if (charset == null || "".equals(charset)) {
                md.update(in.getBytes());
            } else {
                try {
                    md.update(in.getBytes(charset));
                } catch (Exception e) {
                    md.update(in.getBytes());
                }
            }
            byte[] digesta = md.digest();
            return byte2hex(digesta);
        } catch (NoSuchAlgorithmException ex) {
            logger.error("encode(" + in + "," + charset + "):NoSuchAlgorithmException -->" + ex.getMessage());
            return null;
        }
    }

    private static String byte2hex(final byte[] b) {
        String hs = "";
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1) {
                hs = hs + "0" + stmp;
            } else {
                hs = hs + stmp;
            }
        }
        return hs;
    }

    public static String md5(byte[] plainText) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        String md5 = new BigInteger(1, messageDigest.digest(plainText)).toString(16);
        while (md5.length() < 32) {
            md5 = "0" + md5;
        }

        messageDigest.reset();

        if (logger.isDebugEnabled()) {
            logger.debug(new String(plainText, "UTF-8") + "'s MD5: " + md5);
        }

        return md5;
    }

    public MD5() {
    }

    public static void main(String[] arg) {
        System.out.println(MD5.encode("0800270D1988" + "00000000"));
    }
}
