package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int lenghtArray = 5;
        ArrayList<String> strings = new ArrayList<String>(lenghtArray);
        //strings.ensureCapacity(lenghtArray);
        //int[] numArray = new int[lenghtArray];
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < lenghtArray ; i++)
        {
            strings.add(reader.readLine());
        }
        strings.remove(2);
        int size =  strings. size();
        for (int i = 1; i <= size; i++)
        {
            System.out.println(strings.get(size-i));
        }

    }
}
