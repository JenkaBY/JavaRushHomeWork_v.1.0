package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here

        StringBuilder out = new StringBuilder();
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();
            InputStream inStream = new FileInputStream(fileName);
            while (inStream.available()>0){
                out.append((char) inStream.read());
            }
            inStream.close();

        }
        catch (Exception e){

        }
        System.out.print(out.toString());

    }
}
//public class Solution
//{
//    public static void main(String[] args)
//    {
//        //add your code here
//    }
//}
