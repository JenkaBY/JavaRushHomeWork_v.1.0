package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String args[])
    {
        HashMap<String, String> map1 = createMap();
        removeTheFirstNameDuplicates(map1);
        for (Map.Entry<String, String> pair: map1.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Stallone","Name1");
        map.put("Arnold","Name2");
        map.put("Mikki", "Name3");
        map.put("Mous", "Name4");
        map.put("Mini", "Name5");
        map.put("Maxi", "Name6");
        map.put("Allane", "Name7");
        map.put("Stan", "Name7");
        map.put("Sale", "Name8");
        map.put("Serg", "Name1");
        return  map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код

        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            int sum = 0;
            String name= pair.getValue();
            if(map.containsValue(name))
            {
                for(Map.Entry<String, String> pairFromMap: map.entrySet())
                {
                    if(pairFromMap.getValue().equals(name)) sum++;
                }
            }
            if (sum > 1) removeItemFromMapByValue(map, pair.getValue());
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
