package scr.main;

import java.util.Random;

class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Я прогер, хехе");

        int[] arr = {1,2,3,14,6};

        for (int num : arr) {
            Random ran = new Random();
            int x = ran.nextInt(1,100);
            System.out.println(num + " + " + x + " = " +  (num + x));
        }
    }
}