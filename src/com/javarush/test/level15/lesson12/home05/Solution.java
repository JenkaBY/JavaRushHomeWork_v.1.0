package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution
{
    public Solution()
    {
    }
    public Solution(Number s)
    {
    }

    public Solution(Integer object)
    {
    }

    protected Solution(String s)
    {
    }
    protected Solution(int s)
    {
    }
    protected Solution(boolean s)
    {
    }

    Solution(Object object)
    {
    }
    Solution(double object)
    {
    }
    Solution(float object)
    {
    }

    private Solution(short s){}
    private Solution(byte s){}
    private Solution(char s){}

}

//public class Solution {
//}

