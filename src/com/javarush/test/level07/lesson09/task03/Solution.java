package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String mama = "мама";
        String mila = "мыла";
        String ramu = "раму";
        String imenno = "именно";

        ArrayList<String> fastWords = new ArrayList<String>();
        fastWords.add(mama);
        fastWords.add(mila);
        fastWords.add(ramu);

        int size = fastWords.size();
        for (int i = 1; i <= size+2; i += 2)
        {
            fastWords.add(i,imenno);
        }
        for (int i = 0; i < fastWords.size(); i++)
        {
            System.out.println(fastWords.get(i));
        }
    }
}
