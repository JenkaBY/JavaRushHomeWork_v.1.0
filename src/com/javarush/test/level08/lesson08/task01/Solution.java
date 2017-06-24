package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        Set<String> wordsL = new HashSet<String>();
        while (wordsL.size() != 20)
        {
            wordsL.add("Л" + (new Random().nextInt()));
        }
        return (HashSet<String>)wordsL;

    }
}
