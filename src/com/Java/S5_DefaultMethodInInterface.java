package com.Java;

interface Demo
{
    void abc();
    default void show()
    {
        System.out.println("in com.vikash.Demo show");
    }
}
interface MyDemo
{
    default void show()
    {
        System.out.println(" In com.vikash.MyDemo show");
    }
}
class DemoImp implements Demo, MyDemo
{
    public void abc()
    {
        System.out.println("in abc");
    }
    //  public void show()
    //{
     //   System.out.println("in new show");
    //}
    public void show()
    {
        MyDemo.super.show();
    }

}
public class S5_DefaultMethodInInterface
{
    public static void main(String[] args)
    {
        Demo obj = new DemoImp();
        obj.abc();
        obj.show();
    }
}
