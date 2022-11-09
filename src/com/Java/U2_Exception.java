package com.Java;

public class U2_Exception
{
    public static void main(String[] args)
    {
        try
        {
            int a[] = new int [6];
            a[6] = 8;
            int j = 4;
            int k = 2;
            int l = j/k;
            System.out.println("output is " + k);
        }
        catch (ArithmeticException e)
        {
            System.err.println("Error");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Out of limit");
        }
        try
        {
            int i = 9 / 0;

        }
        catch (Exception e)
        {
            System.err.println("Cant divide by zero");
        }
        finally
        {
            System.out.println("Bye");
        }

    }
}

