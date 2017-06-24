package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум
        Collections.sort(array);
        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException {
        //Тут создать и заполнить список
        List<Integer> nums = new ArrayList<Integer>();
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int lenghtArray = Integer.parseInt(reader.readLine());
        for (int i = 0; i < lenghtArray ; i++)
        {
            nums.add(Integer.parseInt(reader.readLine()));
        }
        return nums;
    }
}
