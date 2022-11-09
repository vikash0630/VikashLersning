package com.Java;

class calce
{
    int num1;
    int num2;
    int result;

    public calce()
    {
        num1 = 5;
        num2 = 5;

    }
    public calce(int n)
    {
        num1 = n;
        num2 = n;
    }
    public calce(double d, int n)
    {
        num1 = (int) d;
        num2 = n;
    }
}

public class F_Object1
{
       public static void main(String[] args)
       {
        calce obj = new calce(7.5,9);

           System.out.println("in constructor");
           System.out.println(obj.num1);
           System.out.println(obj.num2);

      }
}