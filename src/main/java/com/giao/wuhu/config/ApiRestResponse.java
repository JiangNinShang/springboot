package com.giao.wuhu.config;

import lombok.Data;

import java.io.Serializable;

/**
 * @author jns
 */
@Data
public class ApiRestResponse<T> implements Serializable {
    private static final int OK_CODE = 200;
    private static final String OK_MSG = "SUCCESS";
    private Integer status;
    private String msg;
    private T data;

    public ApiRestResponse(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ApiRestResponse(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ApiRestResponse() {
        this(OK_CODE, OK_MSG);
    }

    /**
     * 无返回值返回
     *
     * @param <T> 类型
     * @return ApiRestResponse对象
     */
    public static <T> ApiRestResponse<T> success() {
        return new ApiRestResponse<>();
    }

    /**
     * 请求成功带返回值
     *
     * @param result 返回值中的data信息
     * @param <T>    类型
     * @return ApiRestResponse对象
     */
    public static <T> ApiRestResponse<T> success(T result) {
        ApiRestResponse<T> response = new ApiRestResponse<>();
        response.setData(result);
        return response;
    }

    /**
     * 失败时返回
     *
     * @param code 状态码
     * @param msg  错误信息
     * @param <T>  类型
     * @return ApiRestResponse对象
     */
    public static <T> ApiRestResponse<T> error(Integer code, String msg) {
        return new ApiRestResponse<>(code, msg);
    }

    /**
     * 通过枚举返回错误信息
     *
     * @param exceptionEnum 错误码枚举
     * @param <T>           类型
     * @return ApiRestResponse对象
     */
    public static <T> ApiRestResponse<T> error(ApiExceptionEnum exceptionEnum) {
        return new ApiRestResponse<>(exceptionEnum.getCode(), exceptionEnum.getMsg());
    }
}

