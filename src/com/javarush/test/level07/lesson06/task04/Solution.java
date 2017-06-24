package com.javarush.test.level07.lesson06.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 10 строчек в начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int lenghtArray = 10;
        ArrayList<String> strings = new ArrayList<String>();
        strings.ensureCapacity(lenghtArray);
        int[] numArray = new int[lenghtArray];
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numArray.length ; i++)
        {
            strings.add(0, reader.readLine());
            //numArray[i] = strings.get(i).length();
        }
        //Arrays.sort(numArray);
        for (int i = 0; i < strings.size(); i++)
        {
            System.out.println(strings.get(i));
        }

    }
}
