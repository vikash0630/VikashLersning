package com.demo;

public class Callpackage2 extends CallPackage
{
        public static void main(String[] args)
        {
            CallPackage p=new CallPackage();
            p.show();
            p.rollno=8;
            //p.name="vikash"; cant call private methods
            p.marks=57;
            p.age=30;


            System.out.println(p.rollno);
            System.out.println(p.marks);
            System.out.println(p.age);
        }
}
