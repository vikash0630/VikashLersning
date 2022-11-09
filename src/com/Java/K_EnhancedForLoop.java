package com.Java;

public class K_EnhancedForLoop
{
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4};
        int b[] = {5,6,7,8};
        int c[] = {9,10,11,12};

        for(int k : a)
        {
            System.out.println(k);
        }
        int d[] []=
                {
                        {1,2,3,4},
                        {5,6,7,},
                        {9,10,11,12,13}
                };

        for(int k[] : d)
        {
            for(int l:k)
            {
                System.out.print(" " +l);
            }
            System.out.println();
        }

    }
}