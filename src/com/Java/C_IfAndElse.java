package com.Java;

public class C_IfAndElse
{
    public static void main(String[] args)
    {
        //if
        int n = 8;

        if (n % 2 == 0)
            System.out.println("Even");


        if (n % 2 != 0)
            System.out.println("Odd");

        if (true)
            System.out.println("hello");


        if (false)
            System.out.println("bye");
        {
            int m = 9;

            if (m % 2 == 0)
                System.out.println("Even");

            else
                System.out.println("Odd");
            {
                int g=0;
                if (g==0)
                    System.out.println("nothing");
                else
                    if(g%2==0)
                        System.out.println("even");
                    if(g%2!=0)
                        System.out.println("odd");

            }
        }
        {
            //ternary operator
            // ?: -> condition?:expiration1:expiration2
            {
                int i=7;

                int j=0;

                //if(i>6)
                //  j=1;
                //else
                // j=2;
                j = i>6?1:2;

                System.out.println(j);
            }
        }
        // switch
        {
            int x = 3;

            switch(x)
            {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                default:
                    System.out.println("no match");

            }
        }
    }

}
