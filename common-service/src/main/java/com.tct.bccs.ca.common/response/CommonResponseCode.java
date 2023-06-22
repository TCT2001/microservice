package com.tct.bccs.ca.common.response;

public enum CommonResponseCode implements ResponseCode {
    SUCCESS("SUCCESS"),
    FAIL("FAIL");

    private final String code;

    CommonResponseCode(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return this.code;
    }
}
