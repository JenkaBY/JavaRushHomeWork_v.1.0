package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max(long, long), double max(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    //Напишите тут ваши методы
    public static int min(int a, int b)
    {
        return a >= b ? b : a;
    }

    public static long min(long a, long b)
    {
        return a >= b ? b : a;
    }

    public static double min(double a, double b)
    {
        return a >= b ? b : a;
    }
}
//public class Solution
//{
//    public static void main(String[] args)
//    {
//
//    }
//
//    //Напишите тут ваши методы
//}
