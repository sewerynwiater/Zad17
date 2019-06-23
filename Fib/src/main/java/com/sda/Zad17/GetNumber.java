package com.sda.Zad17;
import java.util.Scanner;

public class GetNumber {
    public int getNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę elementów: ");
        int number=scan.nextInt();
        return number;
    }
}
