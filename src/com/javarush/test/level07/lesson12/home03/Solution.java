package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        //напишите тут ваш код
        int n = 20;
        ArrayList<Integer> strings = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++)
        {
            strings.add(Integer.parseInt(reader.readLine()));
        }
        minimum = strings.get(0);
        maximum = minimum;
        for (int i = 1; i < n; i++)
        {
            if (minimum > strings.get(i)) minimum = strings.get(i);
            if (maximum < strings.get(i)) maximum = strings.get(i);
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
