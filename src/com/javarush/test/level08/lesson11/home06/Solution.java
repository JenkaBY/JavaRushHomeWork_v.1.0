package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human father = new Human("Father", true,45);
        Human mother = new Human("Mother", false, 44);
        Human grandfather1 = new Human("Grand Father1", !false, 65);
        Human grandfather2 = new Human("Grand Father2", !false, 66);
        Human grandmother1 = new Human("Grand Mother1", false, 67);
        Human grandmother2 = new Human("Grand Mother2", false, 68);
        Human son = new Human("Child",true,15);
        Human son1 = new Human("Child1",true,16);
        Human son2 = new Human("Child2",true,17);
        father.children.add(son);
        father.children.add(son1);
        father.children.add(son2);

        mother.children.add(son);
        mother.children.add(son1);
        mother.children.add(son2);
        grandfather1.children.add(father);
        grandmother1.children.add(father);
        grandfather2.children.add(mother);
        grandmother2.children.add(mother);
        ArrayList<Human> family = new ArrayList<Human>();
        family.add(grandfather1);
        family.add(grandmother1);
        family.add(grandfather2);
        family.add(grandmother2);
        family.add(father);
        family.add(mother);
        family.add(son);
        family.add(son1);
        family.add(son2);
        for (int i =0;i < family.size(); i++){
            System.out.println(family.get(i).toString());

        }


    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
