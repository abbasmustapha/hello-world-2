package com.mab.helloworld2;

import org.apache.commons.lang3.StringUtils;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello world 2");
        String phraseUnPeuLongue = "Cette phrase et un peu beaucoup longue et elle ne tiendra pas dans l'écran";
        System.out.println(phraseUnPeuLongue);
        String phraseRaccourcie = StringUtils.abbreviate(phraseUnPeuLongue, 24);
        System.out.println(phraseRaccourcie);
    }

}
