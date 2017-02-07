package com.lazi.coder.domain;

public class Result<T> {
    private boolean isOk;
    private String errMsg;
    T result;

    public Result(boolean isOk) {
        this.isOk = isOk;
    }
}
