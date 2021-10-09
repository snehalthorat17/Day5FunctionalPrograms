package com.bridgelabz;

public class HarmonicNumber {

    public static void main(String args[])
    {
        int num = 5;
        double result = 0.0;

        for(int i=num; i>0; i--)
        {
            result = result + (double)1 / i;
            System.out.print(result + ",");
        }
//        System.out.println("Nth harmonic value is: "+result);
    }
}
