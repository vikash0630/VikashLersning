package com.Java;

class Outer
{
    int a;
    public void show()
    {
        System.out.println("in show");
    }
    class Inner
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
    static class Inner1
    {
        public void Ok()
        {
            System.out.println("ok");
        }
    }
}
public class I_Inner
{




    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1 = obj.new Inner();
        obj1.display();


        Outer.Inner1 obj2 = new Outer.Inner1();
        obj2.Ok();
    }
}
