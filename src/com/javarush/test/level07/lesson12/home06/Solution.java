package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни
их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> humans = new ArrayList<Human>();

        Human grandFather1 = new Human("grandFather1", true, null, null, 71);
        Human grandMother1 = new Human("grandMother1", false, null, null, 72);
        Human grandFather2 = new Human("grandFather2", true, null, null, 73);
        Human grandMother2 = new Human("grandMother2", false, null, null, 74);
        Human father = new Human("Father", true, grandFather1, grandMother1, 50);
        Human mother = new Human("Mother", false, grandFather2, grandMother2, 51);
        Human annaDautcher = new Human("Anna", false, father, mother, 18);
        Human nikSon = new Human("Nik", true, father, mother, 15);
        Human dazyDaut = new Human("Dazy", false, father, mother, 30);

        humans.add(annaDautcher);
        humans.add(nikSon);
        humans.add(dazyDaut);
        humans.add(father);
        humans.add(mother);
        humans.add(grandFather1);
        humans.add(grandMother1);
        humans.add(grandFather2);
        humans.add(grandMother2);

        for (int i = 0; i < humans.size(); i++)
        {
            System.out.println(humans.get(i));
        }

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        Human father;
        Human mother;
        int age;

        public  Human(String name, boolean sex, Human father, Human mother, int age)
        {
            this.name = name;
            this.sex= sex;
            this.father = father;
            this.mother = mother;
            this.age = age;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
