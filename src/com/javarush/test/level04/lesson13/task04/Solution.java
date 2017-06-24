package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int stringEight = 8;

        for (int i = 0; i <10 ; i++)
        {
            if (i == 0 )
            {
                for (int j = 0; j < 10; j++)
                {
                    System.out.print(stringEight);
                }
                System.out.println();
            }
            System.out.println(stringEight);
        }

    }
}
