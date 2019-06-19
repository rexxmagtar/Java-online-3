package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task1_4 {




    public static void main(String[] args) {

///Колво цифр в строке;

        String str="332or329893  2ds7lovo word slovo slovo 123";


int count=0;

        char[] true_str=str.toCharArray();
        for(int i=0;i<true_str.length;i++){

            if(true_str[i]>='0' && true_str[i]<='9' &&(i==0 || (true_str[i-1]<'0' || true_str[i-1]>'9'))){
count++;
            }
        }

        System.out.print(count);




}



































}
