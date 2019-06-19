package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task2_7{




    public static void main(String[] args) {

///Из строки удлаить все повторения и пробелы;

        StringBuffer str=new StringBuffer("abc abc   adefaaafffgg  ");

for (int i=0;i<str.length();i++){
if(str.charAt(i)==' ')
{
    while (i<str.length() && str.charAt(i)==' ')
    str.deleteCharAt(i);

}
else {
    for (int k = i+1; k < str.length(); k++) {


            while (k<str.length()  && str.charAt(k) == str.charAt(i))
            str.deleteCharAt(k);

    }
}

}

System.out.print(str);















}



































}
