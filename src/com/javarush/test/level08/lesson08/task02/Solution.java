package com.javarush.test.level08.lesson08.task02;

import java.util.*;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        Set<Integer> wordsL = new HashSet<Integer>();
        while (wordsL.size() != 20)
        {
            wordsL.add(new Random().nextInt(20));
        }
        return (HashSet<Integer>) wordsL;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            if (iterator.next() > 10) iterator.remove();
        }
        return set;

    }
}
