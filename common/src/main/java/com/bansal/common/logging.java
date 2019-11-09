package com.bansal.common;

public class logging {
    public void info(String ... messages){
        for(String message : messages){
            System.out.print(message+"\t");
        }
    }
}