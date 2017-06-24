package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by JenkaBY on 21.01.2017.
 */
public final class Singleton
{
    private final static Singleton SINGLETON = new Singleton();
    private Singleton(){ }
    public static Singleton getInstance(){return SINGLETON;}
}
