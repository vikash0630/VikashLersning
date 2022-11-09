package com.Java;

interface  Abcd
{
    void show();
}
class Implementor implements Abcd
{
    public void show()
    {
        System.out.println("anything");
    }
}

public class S2_interface
{
    public static void main(String[] args)
    {
        Abcd obj = new Implementor();
        obj.show();
    }
}
