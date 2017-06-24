package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int lenghtArray = 5;
        ArrayList<String> strings = new ArrayList<String>(lenghtArray);
        //strings.ensureCapacity(lenghtArray);
        int[] numArray = new int[lenghtArray];
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < lenghtArray ; i++)
        {
            strings.add(reader.readLine());
        }
        //strings.add(0, reader.readLine());
        for (int i = 0; i < 13; i++)
        {
            String last = strings.get(strings.size()-1);
            strings.remove(strings.size()-1);
            strings.add(0,last);
            //System.out.println(strings.get(i));
        }
        for (int i = 0; i < strings.size(); i++)
        {
            System.out.println(strings.get(i));
        }

    }
}
