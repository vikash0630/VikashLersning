package com.Java;

class Emp
{
    int eid;
    int salary;
    static String ceo;

    public void show()
    {
        System.out.println(eid + ":" + salary + ":" + ceo);
    }
}
public class H_Static
{
    public static void main(String[] args)
    {
     Emp raj = new Emp();
     raj.eid = 8;
     raj.salary = 2000;
     Emp.ceo = "arte";
     Emp ravi = new Emp();
     ravi.eid = 9;
     ravi.salary = 30000;
     Emp.ceo = "shyam";    // we don`t need object, we can work with class directly in static keyword

     raj.show();

     ravi.show();
    }
}
