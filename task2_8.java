package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task2_8{




    public static void main(String[] args) {

///найти самое длинное слово

        StringBuffer str=new StringBuffer("abc abc   adefaaafffgg  ");

String the_longest_word="";
int count=0;
int left_mark=0;

for(int i=0;i<str.length();i++){

    if(str.charAt(i)!=' '){
        if(count==0)
            left_mark=i;

        count++;
    }
    else {
        if(count>the_longest_word.length())
            the_longest_word=str.substring(left_mark,i);

        count=0;
    }
}
        System.out.print(the_longest_word);

}

















}




































