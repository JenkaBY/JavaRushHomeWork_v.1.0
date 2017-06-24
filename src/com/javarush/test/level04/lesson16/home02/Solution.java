package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Arrays;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader streamReaderBuffer =  new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(streamReaderBuffer);

        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(numbers);
        System.out.print(numbers[1]);

    }
}
