package com.Java;

abstract class Human
{
    public abstract void eat();

    public void walk()
    {

    }
}
class Man extends Human
{
    public void eat()
    {

    }
}
class Printer
{
   public void show(Number i)
    {
        System.out.println(i);
    }
}

public class Q_Abstract
{
    public static void main(String[] args)
    {
        Printer obj = new Printer();
        obj.show(5.4);
        Human obj1 = new Man();
    }
}
