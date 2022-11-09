package com.Java;

public class J_JaccedArray
{
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4};
        int b[] = {5,6,7,8};
        int c[] = {9,10,11,12};


        int d[] []=
                {
                        {1,2,3,4},
                        {5,6,7,},
                        {9,10,11,12,13}
                };

        for (int i=0; i<d.length; i++)
        {
            for (int j=0; j<d[i].length; j++)
            {
                System.out.print(" " +d[i][j]);
            }
            System.out.println();
        }

    }
}