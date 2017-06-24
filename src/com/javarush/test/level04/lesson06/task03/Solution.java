package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

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
        String sNum3 = bufferedReader.readLine();

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        int num3 = Integer.parseInt(sNum3);

        int[] nums = {num1,num2,num3};
        Arrays.sort(nums);
        for (int i = nums.length-1; i !=-1; i--)
        {
            System.out.println(nums[i]);
        }

    }
}
