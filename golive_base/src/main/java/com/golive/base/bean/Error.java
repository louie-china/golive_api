package com.golive.base.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Created by Administrator on 2016/4/13.
 */
@XStreamAlias("error")
public class Error {

    private static Error instans = null;
    @XStreamAsAttribute
    private String errorType;
    @XStreamAsAttribute
    private String note;
    @XStreamAsAttribute
    private String errorTime;

    private Error(String errorType, String note, String errorTime) {
        this.errorType = errorType;
        this.note = note;
        this.errorTime = errorTime;
    }

    public static Error getInstans(String errorType, String note, String errorTime) {
        instans = new Error(errorType, note, errorTime);
        return instans;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(String errorTime) {
        this.errorTime = errorTime;
    }
}