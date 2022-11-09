package com.Java;

class Abcde
{
    public void show()
    {
        System.out.println("in A show");
    }
}

public class S3_AnonymousInnerClass
{
    public static void main(String[] args)
    {
        Abcde obj = new Abcde()
        {
            public void show()
            {
                System.out.println("Im the best");
            }
        };
        obj.show();
    }
}
