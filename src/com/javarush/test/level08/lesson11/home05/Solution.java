package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++)
        {
            int word_length = words[i].length();
            if (word_length > 1){
                //System.out.print(Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1));
                System.out.print(words[i].substring(0,1).toUpperCase()+words[i].substring(1));
            }
            else System.out.print(words[i].substring(0).toUpperCase());
            if (i != (words.length - 1))
                System.out.print(" ");
        }
    }
}
