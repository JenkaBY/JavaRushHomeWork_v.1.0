package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sNum1 = bufferedReader.readLine();
        String sNum2 = bufferedReader.readLine();

        int m = Integer.parseInt(sNum1);
        int n = Integer.parseInt(sNum2);
        int printedNumber = 8;

        for ( ; m > 0; m--)
        {
            for (int i = n ;i>0; i --)
            {
                System.out.print(printedNumber);
            }
            System.out.println();
        }

    }
}
