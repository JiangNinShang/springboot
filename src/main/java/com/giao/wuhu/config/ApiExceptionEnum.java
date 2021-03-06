package com.giao.wuhu.config;

/**
 * @author jns
 * 请求枚举
 */
public enum ApiExceptionEnum {
    HTTP_ERROR(40000, "请求错误"),
    REQUEST_PARAM_ERROR(10012, "参数错误"),
    SYSTEM_ERROR(50000, "系统异常，请从控制台或日志中查看具体错误信息");
    /**
     * 异常码
     */
    Integer code;
    /**
     * 异常信息
     */
    String msg;

    ApiExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
