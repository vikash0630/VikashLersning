package com.Java;

class calculator
{
    public int add(int i, int j)
    {
        return i+j;
    }
}
class calcAdv extends calculator
{
    public int sub(int i, int j)
    {
        return i-j;
    }
}
class calcVeryAdv extends calcAdv
{
    public int multi(int i, int j)
    {
        return i*j;
    }
}
public class L_Inheritance
{
    public static void main(String[] args)
    {
        calcVeryAdv c1= new calcVeryAdv();
        int result1 = c1.add(7,5);
        int result2 = c1.sub(6,3);
        int result3 = c1.multi(9,2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
