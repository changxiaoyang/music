package com.cxy890.music.model;

import lombok.Data;

@Data
public class CommonResult {
    private int code;
    private String message;
    private Object data;
    private int subcode;

    public static CommonResult build(String data) {
        CommonResult result = new CommonResult();
        result.setCode(200);
        result.setData(data);
        result.setMessage("");
        result.setSubcode(0);
        return result;
    }
}
