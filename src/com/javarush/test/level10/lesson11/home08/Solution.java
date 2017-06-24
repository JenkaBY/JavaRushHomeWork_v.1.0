package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<String>();
        str.add("line 1");
        str.add("line 2");
        str.add("line 3");
        ArrayList<String> str2 = new ArrayList<String>();
        str2.add("2 line 1");
        str2.add("2 line 2");
        str2.add("2 line 3");
        ArrayList<String>[] group = new ArrayList[2];
        group[0] = str;
        group[1] = str2;
        return group;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}