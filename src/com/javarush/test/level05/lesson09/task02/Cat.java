package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес.
 Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    String name = null;
    int age=2;
    int weight=4;
    String  color = "unknown";
    String adress = null;

    public Cat(String name)
    {
        this.name = name;
    }

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
        //this.weight = 4;
    }

    public Cat(String name, int age, int weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
        //this.weight = weight;
    }

    public Cat(int weight, String color, String adress)
    {
        this.weight = weight;
        this.color = color;
        this.adress = adress;
        this.name = "alien";
    }

}
