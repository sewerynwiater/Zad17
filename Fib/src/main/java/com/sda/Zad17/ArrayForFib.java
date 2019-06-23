package com.sda.Zad17;

import java.util.Arrays;
import java.util.Random;

public class ArrayForFib {
    private long[] fibonnaci;

    public ArrayForFib(long[] fibonnaci) {
        this.fibonnaci = fibonnaci;
    }

    public void fillArray(){
        if (fibonnaci.length>0){
        for (int i=0;i<fibonnaci.length;i++){
            if (i==0){
                fibonnaci[0]=0;
            } else if (i==1){
                fibonnaci[1]=1;
            } else if (i>1){
                fibonnaci[i]=fibonnaci[i-2]+fibonnaci[i-1];
            }
        }
        }
    }

    public void fillArrayRandomNumbers(int min, int max){
        Random r = new Random();
        if(min<=max && fibonnaci.length>0){
            for(int i=0;i<fibonnaci.length;i++){
                fibonnaci[i]=r.nextInt(max-min)+min;
            }
        }
    }

    public int arraylenght(){
        return fibonnaci.length;
    }

    @Override
    public String toString() {
        return "Tablica liczb dla "+ fibonnaci.length + "elementów: " + Arrays.toString(fibonnaci) +
                '}';
    }
}
