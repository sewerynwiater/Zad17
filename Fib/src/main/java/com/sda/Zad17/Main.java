package com.sda.Zad17;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        GetNumber num = new GetNumber();
        int number= num.getNumber();
        long[] array =  new long[number];
        ArrayForFib  arrayF = new ArrayForFib(array);
        //arrayF.setArray(number);
        System.out.println(arrayF.arraylenght());
        //arrayF.fillArray();
        int min = num.getNumber();
        int max = num.getNumber();
        arrayF.fillArrayRandomNumbers(min,max);
        System.out.println(arrayF.toString());

    }
}
