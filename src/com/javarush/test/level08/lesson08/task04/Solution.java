package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String args[])
    {
        HashMap<String, Date> map1 = createMap();
        removeAllSummerPeople( map1 );
        for (Map.Entry<String, Date> pair: map1.entrySet())
        {
           System.out.println(pair.getKey() + " - " + pair.getValue() +" " +pair.getValue().getMonth());
        }
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Arnold", new Date("JUNE 16 1983"));
        map.put("Mikk", new Date("JULY 11 1981"));
        map.put("Mous", new Date("MARCH 2 1989"));
        map.put("Mini", new Date("MAY 1 1949"));
        map.put("Maxi", new Date("December 4 1950"));
        map.put("Allane", new Date("MAY 10 1980"));
        map.put("Stan", new Date("August 1 1980"));
        map.put("Sale", new Date("January 1 1980"));
        map.put("Serg", new Date("JUNE 2 1923"));
        return  map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        int birthdayMonth;
        ArrayList<String> names = new ArrayList<String>();
        for(Map.Entry<String, Date> pair: map.entrySet())
        {

            birthdayMonth = pair.getValue().getMonth();
            if( birthdayMonth >= 5 & birthdayMonth <= 7)
            {
               names.add(pair.getKey());
            }
        }
        for(String name: names)
        {
            map.remove(name);
        }

    }
}
