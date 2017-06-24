package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader streamReaderBuffer =  new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(streamReaderBuffer);

        int sum = 0;
        int enteredNumber;
        do
        {
            enteredNumber = Integer.parseInt(bufferedReader.readLine());
            sum += enteredNumber;
        } while ( enteredNumber != -1);

        System.out.print(sum);
    }
}
