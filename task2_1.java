package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task2_1 {




    public static void main(String[] args) {

///Максимально кол-во пробелов;

        String str="   1   dsadad     2 3  31 2 ds d  ";



       int count_max=0;
       int count=0;

        for (int i=0;i<str.length();i++) {
            if(str.charAt(i)==' '){
                count++;
            }
            else    {
                if(count_max<count)
                    count_max=count;

                count=0;
            }

        }

System.out.print(count_max);






}



































}
