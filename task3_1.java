package com.company;

import java.sql.Array;
import java.util.*;

/// Задание на разбор текста.
public class task3_1 {

    static Comparator<ArrayList<String[]>> compare_by_passage_length=new Comparator<ArrayList<String[]>>() {
        @Override
        public int compare(ArrayList<String[]> o1, ArrayList<String[]> o2) {
            if(o2.size()>o1.size())
                return -1;
            if(o2.size()<o1.size())
                return  1;

            return 0;
        }
    };

    static Comparator<String> compare_words_by_length=new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            if(o1.length()>o2.length())
                return 1;
            if(o1.length()<o2.length())
                return -1;
            return 0;

        }
    };



    public  static void compare_by_letters_enters(String[] str,String symbol){

        Comparator<String> compare_words_by_letters_enters_=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if(o1.split(symbol).length>o2.split(symbol).length)
                    return -1;
                if(o1.split(symbol).length<o2.split(symbol).length)
                    return 1;
                if(o1.split(symbol).length==o2.split(symbol).length  && o1.compareTo(o2)!=0)
                    return o1.compareTo(o2);

                return 0;

            }
        };

        Arrays.sort(str,compare_words_by_letters_enters_);
    }


    public static void main(String[] args) {



///

        String str = new String("WHAT DEFIaaaaaNES YOaaaUR SUaaaCCESS.\n" +
                "Eveaaary business is uniquaaely chaaaallenged bay the pressures of digitization. " +
                "Our expert teams and organized service practices help assess your market and design winning experiences, " +
                "whether as a standalone engagement or a full end-to-end transformation program.");









/// Будем хранить в Трехмерном листе абзацы
// и соответствующие им предложения с соответсвующими им словам.



        ArrayList<ArrayList<String[]>> container_1=new ArrayList<ArrayList<String[]>>();

String[] passages=str.split("\n");
for(int i=0;i<passages.length;i++){
    container_1.add(new ArrayList<String[]>());
    String[] sentenses=passages[i].split("\\.");

    for(int k=0;k<sentenses.length;k++){


        String[] words=(sentenses[k].split(" "));
container_1.get(i).add(words);
    }
}

while(true) {
    System.out.println("1- сорт абзацев, 2- сорт слов в предложениях, 3- сорт лексем");

    int answer=new Scanner(System.in).nextInt();
    if(answer==1) {

        container_1.sort(compare_by_passage_length);
    }


        if (answer == 2) {
            for (int i = 0; i < container_1.size(); i++) {
                for (int k = 0; k < container_1.get(i).size(); k++) {
                    Arrays.sort(container_1.get(i).get(k), compare_words_by_length);

                }

            }
        }

    if (answer == 3) {
        System.out.println("Введите символ");
        String symb=new Scanner(System.in).next();
        for (int i = 0; i < container_1.size(); i++) {
            for (int k = 0; k < container_1.get(i).size(); k++) {
                compare_by_letters_enters(container_1.get(i).get(k),symb);

            }

        }
    }



    for (int i = 0; i < container_1.size(); i++) {
        for (int k = 0; k < container_1.get(i).size(); k++) {
            for (int j = 0; j < container_1.get(i).get(k).length; j++) {
                System.out.print(container_1.get(i).get(k)[j] + " ");
            }
            System.out.print(".");
        }
        System.out.print("\n");
    }
}









    }
}
























































