package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.Arrays;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        //напишите тут ваш код
        int num = Integer.parseInt(reader.readLine());
        int readNum = 0;
        //if (num == 1) maximum = readNum;
        int[] enteredNums =new int[num];
        for (int i = 0; i < enteredNums.length ; i++)
        {
            enteredNums[i] =  Integer.parseInt(reader.readLine());
        }
        Arrays.sort(enteredNums);
        System.out.println(enteredNums[num-1]);
    }
}
