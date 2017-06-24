package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            File file = new File(fileName);

            if (!file.exists())
            {
                file.createNewFile();
            }

            String line = reader.readLine();
            OutputStream outStream = new FileOutputStream(fileName);


            while ((line.compareToIgnoreCase("exit") != 0))
            {
                for (Character i : line.toCharArray())
                {
                    outStream.write((int) i);
                }
                outStream.write(System.lineSeparator().charAt(0));
               // System.lineSeparator().toCharArray();
                line = reader.readLine();
            }
            for (Character i : "exit".toCharArray())
            {
                outStream.write((int) i);
            }
            reader.close();
            outStream.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
//public class Solution
//{
//    public static void main(String[] args)
//    {
//    }
//}
