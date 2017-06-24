package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(bufferedReader.readLine());
        int B = Integer.parseInt(bufferedReader.readLine());
        System.out.println(GDC(A,B));

    }

    public static int GDC(int A, int B){
        if (A < B) {
            int temp = B;
            B = A;
            A=temp;
        }
        if (A%B == 0) {return B;}
        else return GDC(B, A%B);
    }
}
//public class Solution
//{
//    public static void main(String[] args) throws Exception
//    {

//    }
//}
