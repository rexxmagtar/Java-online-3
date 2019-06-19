package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task2_2 {




    public static void main(String[] args) {

///Поставить после a букву b;

        StringBuffer str=new StringBuffer("adadsds 23 a a cdgr");





        for (int i=0;i<str.length();i++) {
           if(str.charAt(i)=='a'){
               str.insert(i+1,'b');
           }

        }

System.out.print(str);






}



































}
