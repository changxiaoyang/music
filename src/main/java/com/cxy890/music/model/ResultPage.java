package com.cxy890.music.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ResultPage {

    private List<Object> list = new ArrayList<>();
    private int per_page;
    private int total;
    private int total_page;

}
