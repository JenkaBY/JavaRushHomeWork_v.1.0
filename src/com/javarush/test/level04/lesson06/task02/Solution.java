package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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

        String sNum1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sNum2 = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sNum3 = bufferedReader.readLine();
        String sNum4 = bufferedReader.readLine();

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        int num3 = Integer.parseInt(sNum3);
        int num4 = Integer.parseInt(sNum4);

        int max;
        int max1;
        int max2;

        if (num1 >= num2)
        {
            max1 = num1;
        }
        else max1 = num2;

        if (num3 >= num4)
        {
            max2 = num3;
        }
        else max2 = num4;

        if (max1 >= max2)
        {
            max = max1;
        }
        else max = max2;

        System.out.print(max);
    }
}
