package com.javarush.test.level15.lesson02.task05;

import java.util.ArrayList;
import java.util.List;

/* ООП - исправь ошибки в наследовании
Исправь метод containsBones и всю связанную с ним логику так, чтобы:
1. Поведение программы осталось прежним, т.е. она должна выдавать то же самое, что и выдает сейчас
2. Метод containsBones должен возвращать тип Object и значение "Yes" вместо true, "No" вместо false
*/

public class Solution
{
    public static interface Alive
    {
        Object containsBones();
    }

    public static class BodyPart implements Alive
    {
        private String name;

        public BodyPart(String name)
        {
            this.name = name;
        }

        public Object containsBones()
        {
            return "Yes";
        }

        public String toString()
        {
            if (containsBones().equals("Yes")) return name + " содержит кости";
            if (containsBones().equals("No")) return name + " не содержит кости";
            return "No";
        }
    }

    public static class Finger extends BodyPart
    {
        private boolean isFoot;

        public Finger(String name, boolean isFoot)
        {
            super(name);
            this.isFoot = isFoot;
        }

        public Object containsBones()
        {
            if (super.containsBones().equals("Yes") && !isFoot) return "Yes";
            if (super.containsBones().equals("No") && !isFoot) return "No";
            return "No";
        }
    }

    public static void main(String[] args)
    {
        printlnFingers();
        printlnBodyParts();
        printlnAlives();
    }

    private static void printlnAlives()
    {
        System.out.println(new BodyPart("Рука").containsBones());
    }

    private static void printlnBodyParts()
    {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
        bodyParts.add(new BodyPart("Рука"));
        bodyParts.add(new BodyPart("Нога"));
        bodyParts.add(new BodyPart("Голова"));
        bodyParts.add(new BodyPart("Тело"));
        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers()
    {
        List<Finger> fingers = new ArrayList<Finger>(5);
        fingers.add(new Finger("Большой", true));
        fingers.add(new Finger("Указательный", true));
        fingers.add(new Finger("Средний", true));
        fingers.add(new Finger("Безымянный", false));
        fingers.add(new Finger("Мизинец", true));
        System.out.println(fingers.toString());
    }
}

//public class Solution {
//    public static interface Alive {
//        boolean containsBones();
//    }
//
//    public static class BodyPart implements Alive {
//        private String name;
//
//        public BodyPart(String name) {
//            this.name = name;
//        }
//
//        public boolean containsBones() {
//            return true;
//        }
//
//        public String toString() {
//            return containsBones() ? name + " содержит кости" : name + " не содержит кости";
//        }
//    }
//
//    public static class Finger extends BodyPart {
//        private boolean isFoot;
//        public Finger(String name, boolean isFoot) {
//            super(name);
//            this.isFoot = isFoot;
//        }
//
//        public boolean containsBones() {
//            return super.containsBones() && !isFoot;
//        }
//    }
//    public static void main(String[] args)
//    {
//        printlnFingers();
//        printlnBodyParts();
//        printlnAlives();
//    }
//
//    private static void printlnAlives() {
//        System.out.println(new BodyPart("Рука").containsBones());
//    }
//
//    private static void printlnBodyParts() {
//        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
//        bodyParts.add(new BodyPart("Рука"));
//        bodyParts.add(new BodyPart("Нога"));
//        bodyParts.add(new BodyPart("Голова"));
//        bodyParts.add(new BodyPart("Тело"));
//        System.out.println(bodyParts.toString());
//    }
//
//    private static void printlnFingers() {
//        List<Finger> fingers = new ArrayList<Finger>(5);
//        fingers.add(new Finger("Большой", true));
//        fingers.add(new Finger("Указательный", true));
//        fingers.add(new Finger("Средний", true));
//        fingers.add(new Finger("Безымянный", false));
//        fingers.add(new Finger("Мизинец", true));
//        System.out.println(fingers.toString());
//    }
//}

