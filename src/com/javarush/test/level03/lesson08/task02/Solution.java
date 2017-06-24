package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5c
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
        String sSalary = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры

        int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.
        int nSalary = Integer.parseInt(sSalary); //преобразовываем строку в число.

        System.out.println( name +
                " получает " +
                nSalary +
                " через " + nAge +" лет.");

    }
}