package com.javarush.test.level15.lesson12.home04;

/**
 * Created by JenkaBY on 22.01.2017.
 */
public class Sun implements Planet
{
    private static Sun sun;
    private static final String name = Planet.SUN;

    private Sun(){}

    public static Sun getInstance()
    {
        if (sun == null) return sun = new Sun();
        else return sun;
    }
}
