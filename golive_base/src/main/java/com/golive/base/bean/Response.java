package com.golive.base.bean;

public class Response {

    private String status;            //0-失败；1-成功
    private String errorCode;        //错误编码
    private String errorMsg;        //错误信息
    private String servertime;        //操作时间

    //private JSONObject jsonObject ;
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getServertime() {
        return servertime;
    }

    public void setServertime(String servertime) {
        this.servertime = servertime;
    }

}
