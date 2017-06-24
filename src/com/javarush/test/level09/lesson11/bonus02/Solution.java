package com.javarush.test.level09.lesson11.bonus02;

import java.io.*;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        //String destinationFileName = reader.readLine();


        if (!(new File(sourceFileName).isFile()))
        {
            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();
        }
        String destinationFileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);
        int count = 0;
        int data;
        while ((data = fileInputStream.read()) != -1)
        {
            fileOutputStream.write(data);
            count++;
        }
        //System.out.println("Скопировано байт " + count);
        fileInputStream.close();
        fileOutputStream.close();

//        copyFile(sourceFileName, reader.readLine());

//        if (!(new File(sourceFileName).isFile()))
//        {
//            while (!(new File(sourceFileName).isFile()))
//            {
//                System.out.println("Файл не существует.");
//                sourceFileName = reader.readLine();
//            }
//            copyFile(sourceFileName, reader.readLine());
//        } else copyFile(sourceFileName, reader.readLine());
    }

//    public static void copyFile(String sourceFileName, String destinationFileName) throws IOException
//    {
//        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
//        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);
//        int count = 0;
//        int data;
//        while ((data = fileInputStream.read()) != -1)
//        {
//            fileOutputStream.write(data);
//            count++;
//        }
//        System.out.println("Скопировано байт " + count);
//        fileInputStream.close();
//        fileOutputStream.close();
//
//
//         FileOutputStream fileOutputStream = null;
//
//
//        try (FileInputStream fileInputStream = new FileInputStream(sourceFileName))
//        {
//            fileOutputStream = new FileOutputStream(destinationFileName);
//            int count = 0;
//            int data;
//            while ((data = fileInputStream.read()) != -1)
//            {
//                fileOutputStream.write(data);
//                count++;
//            }
//            System.out.println("Скопировано байт " + count);
//            fileInputStream.close();
//            fileOutputStream.close();
//        }
//        catch (FileNotFoundException fne)
//        {
//            fne.printStackTrace();
//        }
//        catch (IOException ioe)
//        {
//            ioe.printStackTrace();
//            if (fileOutputStream != null) fileOutputStream.close();
//        }
//        finally
//        {
//            if (fileOutputStream != null) fileOutputStream.close();
//        }
//    }
}
