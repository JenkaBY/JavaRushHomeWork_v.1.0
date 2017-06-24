package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String strBuffer;
        do
        {
            strBuffer =  bufferedReader.readLine();
            int num = 0;
            try
            {
                num = Integer.parseInt(strBuffer);
            }
            catch (NumberFormatException e)
            {
                //System.out.println("UPS, что-то пошгло не так" + e.getMessage());
            }
            sum += num;
        }
        while (!strBuffer.equals("сумма"));
       System.out.println(sum);
    }
}
