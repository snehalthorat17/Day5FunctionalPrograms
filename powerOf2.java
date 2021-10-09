package com.bridgelabz;

import java.util.Scanner;

public class powerOf2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any power of 2 till 30");
        int n = sc.nextInt();

        if (0 <= n && n < 31) {
            for (int i = 0; i <= n; i++) {
                double pow = Math.pow(2, i);
                System.out.println("2^"+i +"=" + pow);
            }
        } else {
            System.out.println("Please enter power between 0 to 30");
        }
    }

}
