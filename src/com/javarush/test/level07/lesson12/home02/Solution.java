package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> strings = new ArrayList<String>(n);
        for (int i = 0; i < n; i++)
        {
            strings.add(null);
        }

        for (int i = 0; i < n; i++)
        {
            if (i < m)
            {
                strings.set(n - m + i, reader.readLine());
            }
            else strings.set(i - m, reader.readLine());
        }

        for (int i = 0; i < n; i++)
        {
            System.out.println(strings.get(i));
        }
    }
}
