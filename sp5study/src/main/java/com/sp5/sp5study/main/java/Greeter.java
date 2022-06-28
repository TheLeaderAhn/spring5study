package com.sp5.sp5study.main.java;

public class Greeter {
    private String format;

    public String greet(String guest) {
        return String.format(format, guest);
    }

    public void setFormat(String format){
        this.format = format;
    }
}
