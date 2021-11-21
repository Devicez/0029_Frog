package com.company;

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int total_jmp = 0;

        if(x < 1 || x > 1000 || y < 1 || y > 1000)
        {
            System.out.println("ERROR");
            System.exit(0);
        }

        total_jmp = y/x;
        if(y-(x*total_jmp)>0)
        {
            total_jmp++;
        }

        System.out.println(total_jmp);
    }
}
