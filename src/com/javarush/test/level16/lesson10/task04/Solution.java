package com.javarush.test.level16.lesson10.task04;

/* А без interrupt слабо?
Разберись, как работает программа.
Сделай так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
Нельзя использовать метод interrupt.
*/

public class Solution
{
    static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException
    {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod()
    {
        running = false;
    }

    public static class TestThread implements Runnable
    {
        public void run()
        {
            while (running)
            {
                try
                {
                    System.out.println("he-he");
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                }
            }
        }
    }
}

//public class Solution {
//    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(new TestThread());
//        t.start();
//        Thread.sleep(3000);
//        ourInterruptMethod();
//    }
//
//    public static void ourInterruptMethod() {
//
//    }
//
//    public static class TestThread implements Runnable {
//        public void run() {
//            while(true) {
//                try {
//                    System.out.println("he-he");
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                }
//            }
//        }
//    }
//}
