package com.Java;

public class P_Wrapper
{
    public static void main(String[] args)
    {
        int i=5; //primitive datatype

        Integer ii = new Integer(8); //Boxing, Wrapping
        int j = ii.intValue(); // unboxing, unwrapping

        Integer value =  i; // Autoboxing
        int k = value; // autounboxing

        String str = "123";
        int n = Integer.parseInt(str);

        System.out.println(j);
        System.out.println(k);
        System.out.println(n);
    }
}
