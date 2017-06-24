package com.javarush.test.level03.lesson08.task03;

/* Скромность украшает человека
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!
Пример: Тимур зарабатывает $5,000. Ха-ха-ха!
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
       //String sSalary = bufferedReader.readLine(); //читаем строку с клавиатуры
        //String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры

       // int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.
        //int nSalary = Integer.parseInt(sSalary); //преобразовываем строку в число.

        System.out.println( name +
                " зарабатывает $5,000. Ха-ха-ха!"
                );
    }
}