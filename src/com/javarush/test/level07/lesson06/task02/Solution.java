package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        int[] numArray = new int[5];
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numArray.length ; i++)
        {
            strings.add( reader.readLine());
            numArray[i] = strings.get(i).length();
        }
        Arrays.sort(numArray);
        for (int i = 0; i < strings.size(); i++)
        {
            if (strings.get(i).length() == numArray[strings.size()-1])
            {
                System.out.println(strings.get(i));
            }
        }
    }
}
