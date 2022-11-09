package com.Java;

class Aa
{
    public void show()
    {
        System.out.println("in A");
    }
}
class Bb extends Aa
{
    public void show()
    {
        System.out.println("in B");
    }
}
class Cc extends Aa
{
    public void show()
    {
        System.out.println("in C");
    }
}
public class N_MethodOverriding
{
    public static void main(String[] args)
    {
        Aa obj1 = new Cc();
        obj1.show();
    }
}
