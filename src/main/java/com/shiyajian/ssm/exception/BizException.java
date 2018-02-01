package com.shiyajian.ssm.exception;

public class BizException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BizException() {
        super();
    }

    public BizException(String s) {
        super(s);
    }
}
