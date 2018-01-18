package com.shiyajian.ssm.exception;

public class NologinException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NologinException() {
        super();
    }

    public NologinException(String s) {
        super(s);
    }
}
