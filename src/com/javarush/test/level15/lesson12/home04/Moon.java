package com.javarush.test.level15.lesson12.home04;

/**
 * Created by JenkaBY on 22.01.2017.
 */
public class Moon implements Planet
{
    private static Moon moon;
    private static final String name = Planet.MOON;

    private Moon(){}

    public static Moon getInstance()
    {
        if (moon == null) return moon = new Moon();
        else return moon;
    }
}
