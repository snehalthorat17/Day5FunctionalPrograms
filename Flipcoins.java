package com.bridgelabz;

public class Flipcoins {

    public static void main(String args[])
    {
        int heads = 0;
        int tails = 0;


        for(int i = 0; i<= 100; i++)
        {
            int coin = (int)Math.floor(Math.random() * 10) % 2;
            System.out.println("Coin value is: "+coin);
            if(coin < 0.5)
            {
                System.out.println("It is tails");
                tails+= 1;

            }
            else {
                System.out.println("It is heads");
                heads+= 1;

            }
        }
        int tailPercent = (tails/10) * 100;
        System.out.println("Tails percentage is:"+tailPercent);
        int headPercent = (heads/10) * 100;
        System.out.println("Heads percentage is:"+headPercent);

    }
}
