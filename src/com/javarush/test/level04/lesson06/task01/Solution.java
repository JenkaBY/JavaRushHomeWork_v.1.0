package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код


        String sNum1 = input().readLine(); //читаем строку с клавиатуры
        String sNum2 = input().readLine(); //читаем строку с клавиатуры

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        System.out.print(minimum(num1,num2));
    }
    public static BufferedReader input()
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        return bufferedReader;
    }
    public  static int minimum(int number1, int number2)
    {
        if (number1 <= number2) return number1;
        else return number2;
    }
}