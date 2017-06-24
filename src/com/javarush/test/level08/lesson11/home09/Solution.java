package com.javarush.test.level08.lesson11.home09;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
//        isDateOdd("JANUARY 1 2000");
//        System.out.println(isDateOdd("JANUARY 1 2000"));
//        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date)
    {
        SimpleDateFormat format = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        DateFormat df = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        Date dateParsed = new Date();
        try
        {
            dateParsed = format.parse(date);
            df.parse(date);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateParsed);
        //System.out.println(cal.get((Calendar.DAY_OF_YEAR)));
        return cal.get((Calendar.DAY_OF_YEAR)) % 2 == 0 ? false : true;
    }
}
