package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        // напишите тут ваш код
        //d:\1.txt
        try
        {
            BufferedReader readerFileName = new BufferedReader(new InputStreamReader(System.in));
            String fileName = readerFileName.readLine();
            readerFileName.close();

            BufferedReader readerLine = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

            String line = readerLine.readLine();

            SortedSet<Integer> numbers = new TreeSet<>();

            while (line != null)
            {
                int number = Integer.parseInt(line);
                if (number % 2 == 0) numbers.add(number);
                line = readerLine.readLine();
            }

            for (Integer num : numbers)
            {
                System.out.println(num);
            }
            readerLine.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

//public class Solution
//{
//    public static void main(String[] args)
//    {
//        // напишите тут ваш код
//    }
//}
