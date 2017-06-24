package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        Map<String, String> map =  new HashMap<String, String>();
        for (int i = 0; i < 10; i ++)
        {
            if(i%2 == 0)
            {
                map.put("SecondName"+ i,"FirstName" + "Even");
            }
            else map.put("SecondName"+ i,"FirstName" + "Odd");

        }
        return (HashMap<String,String>)map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int sum = 0;
        if(map.containsValue(name))
        {
            for(Map.Entry<String, String> pair: map.entrySet())
            {
                if(pair.getValue().equals(name)) sum++;
            }
        }
       return sum;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //напишите тут ваш код
        int sum = 0;
        if(map.containsKey(familiya))
        {
            for(Map.Entry<String, String> pair: map.entrySet())
            {
                if(pair.getKey().equals(familiya)) sum++;
            }
        }
        return sum;

    }
}
