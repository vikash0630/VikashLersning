package com.Java;

public class D_Iteration
{
    public static void main(String[] args)
    {
        //while

        int i=1;
        while(i<=5)
        {
            System.out.println("hello");
            i++;
        }

        // do

        int y=4;
        do {
            System.out.println("hi");
            y++;
        }while (y<=5);

        //for
        for(int z=5; z<=5; z++)
        {
            System.out.println("bye");
        }
        //nested loop
        for(int k=1; k<=4; k++)
        {
            for(int j=1; j<=4; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
      }
    }