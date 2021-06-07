package com.metanit;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String str = "Jane hurried to the bargain sale         intending         to buy some cheap and nice garments: shirts, skirts, and breeches.  ";
        int count = str.split(" +").length;
        System.out.println(count);
    }
}
