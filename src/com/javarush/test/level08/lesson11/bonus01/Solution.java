package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        ArrayList<String> monthOfYear = new ArrayList<String>();
        monthOfYear.add("January");
        monthOfYear.add("February");
        monthOfYear.add("March");
        monthOfYear.add("April");
        monthOfYear.add("May");
        monthOfYear.add("June");
        monthOfYear.add("July");
        monthOfYear.add("August");
        monthOfYear.add("September");
        monthOfYear.add("October");
        monthOfYear.add("November");
        monthOfYear.add("December");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        System.out.print(s + " is " + (monthOfYear.indexOf(s) + 1) + " month");

    }

}
