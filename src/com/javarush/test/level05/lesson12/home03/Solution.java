package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том
и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);

        //напишите тут ваш код
        Mouse jerryMouseGF = new Mouse("JerrysGF", 10 , 4);
        Cat tomCat = new Cat("Tom",2, "Black");
        Cat tomsFriend1 = new Cat("Friend1", 3, "Red");
        Dog tomsMaster = new Dog("fatOldWoman", 100, "female");

    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //добавьте тут ваши классы

    public static class Cat
    {
        String name;
        int age;
        String color;

        public Cat(String name, int age, String color)
        {
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }

    public static class Dog
    {
        String name;
        int strength;
        String gender;

        public Dog(String name, int strength, String gender)
        {
            this.name = name;
            this.strength = strength;
            this.gender = gender;
        }
    }

}
