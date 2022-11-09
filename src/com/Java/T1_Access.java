package com.Java;

import com.demo.CallPackage;
import com.demo.Callpackage2;

public class T1_Access extends Callpackage2
{
    public static void main(String[] args)
    {
        CallPackage p=new CallPackage();
        p.show();
        p.rollno=8;
       // p.name="vikash";   cant call privet methods
        System.out.println(p.rollno);
    }
}
