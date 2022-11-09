package com.Java;

class A
{
    public A()
    {
        System.out.println("in com.vikash.A");
    }
    public A(int i)
    {
        System.out.println("in com.vikash.A int");
    }
}
class B extends A
{
    public B()
    {
        super(5);
        System.out.println("in com.vikash.B");
    }
    public B(int i)
    {
        super(i);
        System.out.println("in com.vikash.B int");
    }
}
public class M_Super
{
    public static void main(String[] args)
    {
        B obj1 = new B();
    }
}
