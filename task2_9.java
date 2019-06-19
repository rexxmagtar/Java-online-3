package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task2_9 {


    public static void main(String[] args) {

///Посчитать кол-во строчных и прописных букв

        StringBuffer str = new StringBuffer("A B c d e f 1232 sasa 3123 sa ");

        String the_longest_word = "";
        int count_big = 0;
        int count_small = 0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                count_big++;
            }
            else{
                if(str.charAt(i)>='a' && str.charAt(i)<='z')
                    count_small++;
            }
        }

        System.out.print("small- "+count_small+" big- "+count_big);
    }
}
























































