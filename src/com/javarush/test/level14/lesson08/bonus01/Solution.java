package com.javarush.test.level14.lesson08.bonus01;

import javax.crypto.ExemptionMechanismException;
import java.io.EOFException;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
        try
        {
            String[] strings = {"s"};
            System.out.println(strings[2]);

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            ArrayList strings = null;
            System.out.println(strings.getClass());

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            String strings = "sd";
            Integer n = Integer.parseInt(strings);
            //System.out.println(strings.getClass());

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new EOFException();

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new EmptyStackException();

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new ExportException("");

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new RuntimeException();

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new EmptyStackException();

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new ExemptionMechanismException();

        } catch (Exception e)
        {
            exceptions.add(e);
        }


    }
}

//public class Solution
//{
//    public static List<Exception> exceptions = new ArrayList<Exception>();
//
//    public static void main(String[] args)
//    {
//        initExceptions();
//
//        for (Exception exception : exceptions)
//        {
//            System.out.println(exception);
//        }
//    }
//
//    private static void initExceptions()
//    {   //it's first exception
//        try
//        {
//            float i = 1 / 0;
//
//        } catch (Exception e)
//        {
//            exceptions.add(e);
//        }
//
//        //Add your code here
//
//    }
//}
