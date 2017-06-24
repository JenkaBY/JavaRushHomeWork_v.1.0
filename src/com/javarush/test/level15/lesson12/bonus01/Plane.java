package com.javarush.test.level15.lesson12.bonus01;


/**
 * Created by JenkaBY on 22.01.2017.
 */
public class Plane implements Flyable
{
    private int passenger;

    public Plane(int passenger)
    {
        this.passenger = passenger;
    }

    @Override
    public void fly()
    {

    }
}
