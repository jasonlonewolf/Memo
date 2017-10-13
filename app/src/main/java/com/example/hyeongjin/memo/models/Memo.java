package com.example.hyeongjin.memo.models;

/**
 * Memo classs
 */

public class Memo {

    private String title;
    private String memo;
    private String date;

    public Memo(String title, String memo, String date) {
        this.title = title;
        this.memo = memo;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getMemo() {
        return memo;
    }

    public String getDate() {
        return date;
    }
}
