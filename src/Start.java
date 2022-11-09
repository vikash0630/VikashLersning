public class Start
{
    public static void main(String[] args)
    {
       int n=10,count=0;
       for(int i=2;i<n;i++)
       {
           if (n%i==0)
           {
               System.out.println(n+ " is  not a prime");
              count=1;
               break;

           }

       }
       if (count==1){
           System.out.println("number is not a prime "+n);
       }

    }
}
