package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        HashSet<String> eda = new HashSet<String>();
        eda.add("арбуз");
        eda.add("банан");
        eda.add("вишня");
        eda.add("груша");
        eda.add("дыня");
        eda.add("ежевика");
        eda.add("жень-шень");
        eda.add("земляника");
        eda.add("ирис");
        eda.add("картофель");
        for (String s: eda)
        {
            System.out.println(s);
        }
    }
}
