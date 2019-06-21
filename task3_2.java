package com.company;

import java.sql.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/// Задание на разбор xml-файла.
public class task3_2 {







    public static void main(String[] args) {



///



        String str = new String("<notes>\n" +
                "<note id = \"1\">\n" +
                "<to>Вася</to>\n" +
                "<from>Света</from>\n" +
                "<heading>Напоминание</heading>\n" +
                "<body>Позвони мне завтра!</body>\n" +
                "</note>\n" +
                "<note id = \"2\">\n" +
                "<to>Петя</to>\n" +
                "<from>Маша</from>\n" +
                "<heading>Важное напоминание</heading>\n" +
                "</note>\n" +
                "</notes>\n");







        System.out.println(Pattern.matches("</[^>]*>"  ,"</note>"));


        String[] lines=str.split("\n");


        Pattern  pat_attribute=Pattern.compile("\\s[^\\s]*\\s=\\s\"\\d*\"");

        Pattern pat_tag_info=Pattern.compile(">[^<]*<");

        Pattern pat_in_bolds_closed=Pattern.compile("</[^>]*>");
        StringBuilder passes=new StringBuilder("");


        for(int i=0;i<lines.length;i++){




            if(lines[i].matches("<[^/<]*>$")){///только открывающий в  строке


                System.out.println(passes+ "Название узла(открывющий тег) : " +lines[i].substring(1,lines[i].length()-1).split(" ")[0]);
                Matcher mat=pat_attribute.matcher(lines[i]);
                if(mat.find()){


                    System.out.println(passes+"Атрибуты "+ mat.group());
                }
                passes.append("   ");

            }

            else {
                if(lines[i].matches("<[^>]*>[^<]*<[^>]*>")) {
                    ///отктытие +закрытие тега

                    System.out.println(passes+"Название узла : " + lines[i].substring(1, lines[i].length()).split(">")[0]);

                    Matcher mat = pat_attribute.matcher(lines[i]);
                    if (mat.find()) {


                        System.out.println(passes+" "+"Атрибуты " + mat.group());
                    }
                    Matcher mat_2 = pat_tag_info.matcher(lines[i]);
                    if (mat_2.find()) {

                        System.out.println(passes+"" +"инфо: " + mat_2.group().substring(1, mat_2.group().length() - 1));
                    }


                }
                else {

                    passes.delete(0,3);
                    System.out.println( passes+"Закрывающий тег "+lines[i].substring(2,lines[i].length()-1));


                }





                }
            }

        }








}














































































