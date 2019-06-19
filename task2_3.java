package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task2_3 {

public static boolean check_if_polindrom(String str){

    for(int i=0;i<str.length()/2;i++){

        if(str.charAt(i)!=str.charAt(str.length()-1-i))
            return  false;
    }
    return  true;


}


    public static void main(String[] args) {

///Проверить на палиндром;

        String str="1235321";







System.out.print(check_if_polindrom(str) ? "true":"false" );






}



































}
