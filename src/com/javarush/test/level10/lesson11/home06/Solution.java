package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String color;
        String firstName;
        String lastName;
        int age;
        int height;
        int weight;

        public Human(){
            color = "white";
            firstName = "first name";
            lastName = "second name";
            age = 0;
            height = 170;
            weight = 70;
        }

        public Human(String firstName, String lastName){
            this.color = "white";
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = 0;
            this.height = 170;
            this.weight = 70;
        }

        public Human(String firstName){
            this.color = "white";
            this.firstName = firstName;
            this.lastName = "second name";
            this.age = 0;
            this.height = 170;
            this.weight = 70;
        }

        public Human(String firstName, String lastName, String color){
            this.color = color;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = 0;
            this.height = 170;
            this.weight = 70;
        }

        public Human(String firstName, String lastName, String color, int age){
            this.color = color;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.height = 170;
            this.weight = 70;
        }

        public Human(String firstName, String lastName, String color, int age, int height, int weight){
            this.color = color;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String firstName, String lastName, int age, int height, int weight){
            this.color = "black";
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String firstName, int age, int height, int weight){
            this.color = "black";
            this.firstName = firstName;
            this.lastName = "last";
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String firstName, String lastName,  int height, int weight){
            this.color = "black";
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = 18;
            this.height = height;
            this.weight = weight;
        }

        public Human(String firstName,  int height, int weight){
            this.color = "black";
            this.firstName = firstName;
            this.lastName = "last";
            this.age = 18;
            this.height = height;
            this.weight = weight;
        }


    }
}
