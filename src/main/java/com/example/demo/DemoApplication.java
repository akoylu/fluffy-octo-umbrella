package com.example.demo;

import org.apache.commons.lang3.StringUtils;

public class DemoApplication {

    public static void main(String[] args) {

        String join = StringUtils.join("Hello", " ", " World", "!", ".,.");

        System.out.println(join);
    }

}
