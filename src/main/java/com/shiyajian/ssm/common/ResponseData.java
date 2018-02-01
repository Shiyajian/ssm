package com.shiyajian.ssm.common;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

public class ResponseData implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code;
    private Object data;

    public ResponseData(Integer code, Object data) {
        super();
        this.code = code;
        this.data = data;
    }

    public ResponseData(Integer code) {
        super();
        this.code = code;
    }

    public ResponseData() {
        super();
    }

    public Integer getCode() {

        return code;
    }

    public Object getData() {

        return data;
    }

    public void setCode(Integer code) {

        this.code = code;
    }

    public void setData(Object data) {

        this.data = data;
    }

    public ResponseData success() {
        this.code = HttpStatus.OK.value();
        return this;
    }

    public ResponseData success(Object data) {
        this.code = HttpStatus.OK.value();
        this.data = data;
        return this;
    }
}
