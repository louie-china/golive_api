package com.golive.base.util;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;

import java.io.IOException;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/12.
 */
public class HttpClientUtil {
    private static HttpClient httpClient = null;

    public static Object post(String url, Map<String, String> parms, RequestEntity requestEntity) {
        httpClient = new HttpClient();
        PostMethod postMethod = new PostMethod(url);
        if (requestEntity != null)
            postMethod.setRequestEntity(requestEntity);
        if (parms != null) {
            NameValuePair nameValuePairs[] = new NameValuePair[parms.size()];
            NameValuePair nameValuePair = null;
            int count = 0;

            for (Map.Entry<String, String> entry : parms.entrySet()) {
                nameValuePair = new NameValuePair(entry.getKey(), entry.getValue());
                nameValuePairs[count] = nameValuePair;
                count++;
            }
        }
        try {
            int code = httpClient.executeMethod(postMethod);
            if (code == 200)
                return postMethod.getResponseBody();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
