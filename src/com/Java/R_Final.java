package com.Java;

final class Ab
{
    final int i = 20;
    final int DAY;
    public Ab()
    {
        DAY = 10;
    }
   public final void show()
   {
       System.out.println("in A show");
   }
}

public class R_Final
{
    public static void main(String[] args)
    {
        Ab obj = new Ab();
       obj.show();

        System.out.println(obj.i);
        System.out.println(obj.DAY);
    }
}
