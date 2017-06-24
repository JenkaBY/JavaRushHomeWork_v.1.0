package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        String name = "SomeName";
        String address = "SomeAddress";
        int age = 31;

        Man man1 = new Man(name+"Man1", age,address);
        Man man2 = new Man(name+"Man2", 112, address);

        Woman woman1 = new Woman(name+"woMan", 12, address);
        Woman woman2 = new Woman(name, age, address);

        //выведи их на экран тут
        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(woman1.toString());
        System.out.println(woman2.toString());
    }

    //добавьте тут ваши классы
    /*public static class Man extends Woman
    {
        public Man(String name)
        {
            super(name);
        }

        public Man(String name, int age)
        {
            super(name, age);
        }

        public Man(String name, int age, String address)
        {
            super(name, age, address);
        }
    }*/
    public static class Man
    {
        String name= "";
        int age = 0;
        String address = "Unknown";

        public Man(String name)
        {
            this.name = name;
        }

        public Man(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman
    {
        String name= "";
        int age = 0;
        String address = "Unknown";

        public Woman(String name)
        {
            this.name = name;
        }

        public Woman(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
