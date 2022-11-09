package com.Java;

interface Writer
{
    void Write();
}
class Erase
{
   public void Write()
   {
       System.out.println("erase");
   }
}
class Pen extends Erase implements Writer
{
    public void Write()
    {
        System.out.println("Im a pan");
    }
}

class Pencil implements Writer
{
    public void Write()
    {
        System.out.println("Im a pencil");
    }
}
class Kit
{
    public void doSomthing(Writer p)
    {
        p.Write();
    }
}
public class S1_interface
{
    public static void main(String[] args)
    {
        Kit k = new Kit();
        Writer p = new Pen();
        Writer pc = new Pencil();
        k.doSomthing(p);
    }
}
