package uits.jv.Calculator;

import java.util.Scanner;

/**
 * Created by Nia on 25.12.2015.
 */
public class App {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println(MathOperation.summ(10,-1));
        System.out.println(MathOperation.diff(4,5));
        System.out.println(MathOperation.mul(4,5));
        System.out.println(MathOperation.div(4, 5));



    }
}
