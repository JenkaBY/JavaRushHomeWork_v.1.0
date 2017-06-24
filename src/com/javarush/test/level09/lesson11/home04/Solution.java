package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //SimpleDateFormat formatOld = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatNew = new SimpleDateFormat("MMM dd, yyyy",Locale.US);
        //Locale.setDefault(Locale.ENGLISH);
        Date dateParsed =  new SimpleDateFormat("MM/dd/yyyy",Locale.US).parse(reader.readLine());
        //Date dateParsed = formatOld.parse(reader.readLine());
        //System.out.println(dateParsed.toString());
        String dateInNewFormat = formatNew.format(dateParsed);
        System.out.print(dateInNewFormat.toUpperCase());

    }
}
