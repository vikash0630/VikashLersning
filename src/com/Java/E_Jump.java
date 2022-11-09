package com.Java;

public class E_Jump
{
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++)
        {
            if(i==7)
            {
                continue;   //its skip or p the iteration
            }
            System.out.println("Value is " + i);
        }
        for(int y=1;y<=10;y++)
        {
            if (y>5)
            {
                break;  // its stop or break the iteration
            }
            System.out.println("Value is " + y);
        }

    }
}
