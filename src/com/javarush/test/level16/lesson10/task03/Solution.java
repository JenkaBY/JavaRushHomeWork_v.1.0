package com.javarush.test.level16.lesson10.task03;

/* Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution
{
    public static void main(String[] args) throws InterruptedException
    {
        //Add your code here - добавь код тут
        TestThread interruped = new TestThread();
        interruped.start();
        interruped.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread
    {
        @Override
        public void run()
        {
            long sun = 0;
            while (!Thread.currentThread().isInterrupted())
            {
                sun++;
            }
        }
    }
}

//public class Solution {
//    public static void main(String[] args) throws InterruptedException {
//        //Add your code here - добавь код тут
//    }
//
//    //Add your code below - добавь код ниже
//    public static class TestThread {
//    }
//}
