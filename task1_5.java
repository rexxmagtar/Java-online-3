package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task1_5 {




    public static void main(String[] args) {

///Убрать лишние пробелы;

        String str="   1   dsadad     2 3  31 2 ds d  ";



        int k=0;

        char[] true_str=str.toCharArray();

        char[] new_str=new char[256];
        for(int i=0;i<true_str.length;i++){

            if(true_str[i]==' ' && (i==0 || i==true_str.length-1 ||(true_str[i+1]==' ' || true_str[i-1]==' '))){
                ///Ничего :)
            }
            else
            {
                new_str[k++]=true_str[i];
            }
        }

        System.out.print(new_str);




}



































}
