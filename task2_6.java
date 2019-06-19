package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task2_6 {




    public static void main(String[] args) {

///Из заданной строки получить новую повторив каждый символ дважды;

        StringBuffer str=new StringBuffer("word");

for (int i=0;i<str.length();i+=2){

    str.insert(i,str.charAt(i));

}

System.out.print(str);















}



































}
