package com.work.basicweb.model;

import lombok.Data;

@Data
public class BoardDto {

    private int boardSeq;
    private String title;
    private String contents;
    private String regDate;

}
