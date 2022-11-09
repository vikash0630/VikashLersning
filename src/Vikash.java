public class Vikash {
    public static void main(String[] args)
    {
     int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);
        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println(" ");
        int a,fact=1;
        int number=5;
        for(a=1;a <= number;a++)
        {
            fact=fact*a;
        }
        System.out.println("factor of " +number+ " is " +fact);
        System.out.println(" ");
        float f= 10.5f;
        int b=(int)f;
        System.out.println(b);
    }
}
