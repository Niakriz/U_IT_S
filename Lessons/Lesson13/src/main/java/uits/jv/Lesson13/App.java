package uits.jv.Lesson13;

import java.util.Scanner;

/**
 * Created by Nia on 11.12.2015.
 */
public class App {
    public static void main (String[] args){

        int a;
        int b;

        Scanner rx  = new Scanner(System.in);

        System.out.println("Укажите число A :");
        a = rx.nextInt();
        System.out.println("Укажите число B:");
        b = rx.nextInt();

        int c = a+b;


        System.out.println("Суммы а+b = "+c);




    }
}
