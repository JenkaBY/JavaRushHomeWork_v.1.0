package com.javarush.test.level14.lesson06.home01;

/**
 * Created by JenkaBY on 18.01.2017.
 */
public class UkrainianHen extends Hen
{
    final static String country = Country.UKRAINE;

    @Override
    public int getCountOfEggsPerMonth()
    {
        return country.length()*country.length()-country.length()+1;
    }
    @Override
    public String getDescription(){
        return super.getDescription()+" Моя страна - "+country+". Я несу "+getCountOfEggsPerMonth()+ " яиц в месяц.";
    }
}
