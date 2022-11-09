package com.Java;

class calc
{
    int result1;
    int result2;
    int result3;
    int result4;

    public void perform(int  num1, int num2)
    {
        result1 = num1 + num2;
        result2 = num1 - num2;
        result3 = num1 * num2;
        result4 = num1 / num2;
    }
}
public class F_Object
{
    public static void main(String[] args)
    {
        calc obj = new calc();
        calc obj2 = new calc();

        obj.perform(10,5);
        obj2.perform(6,8);

        System.out.println(obj.result3);
        System.out.println(obj2.result2);

    }
}
