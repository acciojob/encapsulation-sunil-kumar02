package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly obj = new RWOnly();

        //obj.name("sunil")

        obj.setName("sunil");
        String ans = obj.getName();

        System.out.println(ans);
    }


  
}