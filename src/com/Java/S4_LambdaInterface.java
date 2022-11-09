package com.Java;

interface Abcdef
{
    void show();
}

public class S4_LambdaInterface
{
    public static void main(String[] args)
    {
        Abcdef obj= () -> System.out.println("Im the best");
        obj.show();
    }
}