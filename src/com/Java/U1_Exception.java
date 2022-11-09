package com.Java;

public class U1_Exception
{
    public static void main(String[] args)
    {
        try
        {
            int j = 4;
            int k = 2;
            int l = j/k;
            System.out.println("output is " + k);
        }
        catch (Exception e)
        {
            System.err.println("Error");
        }
        try
        {
            int i = 9 / 0;

        }
        catch (Exception e)
        {
            System.err.println("Error");
        }
        finally
        {
            System.out.println("Bye");
        }

    }
}
