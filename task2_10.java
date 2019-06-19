package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task2_10 {


    public static void main(String[] args) {

///Посчитать кол-во предложений

        StringBuffer str = new StringBuffer("WHAT DEFINES YOUR SUCCESS?\n" +
                "Every business is uniquely challenged by the pressures of digitization. " +
                "Our expert teams and organized service practices help assess your market and design winning experiences, " +
                "whether as a standalone engagement or a full end-to-end transformation program!");

        String the_longest_word = "";
        int count = 0;


        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='!' || str.charAt(i)=='?' || str.charAt(i)=='.'){
                count++;
            }
        }

        System.out.print(count);
    }
}
























































