package com.javarush.test.level16.lesson05.task03;

/**
 * Created by JenkaBY on 24.01.2017.
 */
public class Test
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Start program - main thread");
        System.out.println("------------------------------------------------------------");
        Tclass fibonachi = new Tclass();
        Tclass fibonachi2 = new Tclass();
        //fibonachi.run();
//        for (int i = 0; i < 43; i++)
//        {
//            System.out.print(" "+ fibonachi.fibonachi(i));
//            //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946
//        }
        fibonachi.start();
        Thread.sleep(1000);
        fibonachi2.start();

        fibonachi.join();


        System.out.println("------------------------------------------------------------");
        System.out.println("Stop program - main thread");
    }

    public static class Tclass extends Thread
    {
        static int count;
        public void run()
        {
            System.out.println("\nStart evaluation - fibonachi thread");
            count++;
            for (int i = 0; i < 43; i++)
            {
                System.out.print(count + ": "+fibonachi(i)+" ");
            }
            System.out.println();

            System.out.println("Stop  evaluation - fibonachi thread");
        }

        private long fibonachi(int n)
        {
            long temp;
            if (n == 0) return temp = 0;
            if (n == 1) return temp = 1;
            temp = fibonachi(n - 2) + fibonachi(n - 1);
            return temp;
        }
    }
}

