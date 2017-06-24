package com.javarush.test.level15.lesson12.home04;

/**
 * Created by JenkaBY on 22.01.2017.
 */
public class Earth implements Planet
{
    private static Earth earth;
    private static final String name = Planet.EARTH;;

    private Earth(){}

    public static Earth getInstance()
    {
        if (earth == null) return earth = new Earth();
        else return earth;
    }
}
