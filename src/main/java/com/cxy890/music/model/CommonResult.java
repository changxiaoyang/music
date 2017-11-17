package com.cxy890.music.model;

import lombok.Data;

@Data
public class CommonResult {

    private int code;
    private String message;
    private Object data;
    private int subcode;

}
