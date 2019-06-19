package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task1_1 {


public  static  char[] insert(char[] mass,int index,char symbol){
    char[] new_mass=new char[mass.length+1];



        for (int i= 0;i<index;i++){
            new_mass[i]=mass[i];


        }
        new_mass[index]=symbol;
        int k=index;
        for(int i=index+1;i<new_mass.length;i++){
            new_mass[i]=mass[k++];
        }
return new_mass;
    }

    public static void main(String[] args) {

///Дан массив названий переменных в camelCase. Преобразовать в названия snake_case;

        String[] mass=new String[5];
        mass[0]="camelCase";
        mass[1]="snakeFake";
        mass[2]="redBlueWhite";
        mass[3]="dfdErsae";
        mass[4]="reTwa";



        char[][] true_mass=new char[5][256];
        for(int i=0;i<5;i++){

            true_mass[i]=mass[i].toCharArray();
        }


        for(int i=0;i<5;i++){
            for(int k=0;k<true_mass[i].length;k++){
                {
                    if(true_mass[i][k]<='Z'){
                        true_mass[i][k]+='a'-'A';
                       true_mass[i]= insert(true_mass[i],k, '_');

                    }
                }
            }
        }


for (int i=0;i<5;i++){

    System.out.println(true_mass[i]);
}


































    }
}
