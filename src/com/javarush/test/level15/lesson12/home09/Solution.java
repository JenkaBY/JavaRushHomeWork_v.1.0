package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        BufferedReader urlReader = null;
        List<String> paramsKey = new ArrayList<String>();
        List<String> paramsValue = new ArrayList<String>();
        String url = "";

        try
        {
            urlReader = new BufferedReader(new InputStreamReader(System.in));
            url = urlReader.readLine();
        }
        catch (IOException e){}
        finally
        {
            try
            {
                urlReader.close();
            }
            catch (IOException e){}
        }

        String[] listOfParam = url.substring(url.indexOf("?") + 1).split("&");
        if (listOfParam.length != 0)
        {
            for (String param : listOfParam)
            {
                String[] tempParams = param.split("=");
                if (tempParams.length > 1)
                {
                    paramsKey.add(tempParams[0]);
                    paramsValue.add(tempParams[1]);
                } else
                {
                    if (tempParams[0].compareTo("") != 0)
                    {
                        paramsKey.add(tempParams[0]);
                        paramsValue.add("");
                    }
                }
            }
        }

        StringBuilder outputStringWithParams = new StringBuilder();
        for (String oneParam : paramsKey)
        {
            outputStringWithParams.append(oneParam + " ");
        }

        System.out.println(outputStringWithParams.substring(0, outputStringWithParams.length() - 1));

        for (int i = 0; i < paramsKey.size(); i++)
        {
            if (paramsKey.get(i).compareTo("obj") == 0)
            {
                try
                {
                    alert(Double.parseDouble(paramsValue.get(i)));
                }
                catch (Exception e)
                {
                    alert(paramsValue.get(i));
                }
                finally{}
            }
        }
    }

    public static void alert(double value)
    {
        System.out.println("double " + value);
    }

    public static void alert(String value)
    {
        System.out.println("String " + value);
    }
}

//public class Solution {
//    public static void main(String[] args) {
//        //add your code here
//    }
//
//    public static void alert(double value) {
//        System.out.println("double " + value);
//    }
//
//    public static void alert(String value) {
//        System.out.println("String " + value);
//    }
//}