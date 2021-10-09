package com.bridgelabz;

public class Swap2Numbers {
    public static void main(String args[])
    {
        int num1 = 10;
        int num2 = 20;

        System.out.println("before swapping numbers: "+num1 +"  "+ num2);
        /*swapping */
        int t = num1;
        num1 = num2;
        num2 = t;
        System.out.println("After swapping: "+num1 +"   " + num2);
    }
}
