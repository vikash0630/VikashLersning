package com.Java;

interface Demo2
{
    int num=8;
    void abc();
    static void show()
    {
        System.out.println("HI");
    }
}

public class S6_StaticMethodInterface
{
    public static void main(String[] args)
    {
        Demo2.show();
    }
}
