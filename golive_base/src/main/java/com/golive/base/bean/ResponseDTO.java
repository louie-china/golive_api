package com.golive.base.bean;

import com.golive.base.util.DateHelper;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Created by Administrator on 2016/4/11.
 */
@XStreamAlias("response")
public class ResponseDTO {

    public static ResponseDTO instanse = null;
    @XStreamAlias("error")
    @XStreamAsAttribute
    private Error error;
    @XStreamAlias("data")
    private Object result;

    public ResponseDTO(String responseCode, String mess, Object result) {
        this.error = Error.getInstans(responseCode, mess, DateHelper.getNow());
        this.result = result;
    }

    public static ResponseDTO getInstanse(String responseCode, String mess, Object result) {
        instanse = new ResponseDTO(responseCode, mess, result);
        return instanse;
    }

    public static void setInstanse(ResponseDTO instanse) {
        ResponseDTO.instanse = instanse;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
