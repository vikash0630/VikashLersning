import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
//        int n,m,i,j;
//        System.out.println("Enter two number");
//        Scanner r= new Scanner(System.in);
//        n= r.nextInt();
//        m= r.nextInt();
//        for ( i=n;i<=m;i++){
//            for ( j=2; j<=i;j++){
//                if(i%j==0);
//                break;
//            }
//            if(i==j){
//                System.out.println(j);
//            }
//        }

//        int num = 20, count;
//
//        for (int i = 2; i <= num; i++) {
//            count = 0;
//            for (int j = 2; j <= i / 2; j++) {
//                if (i % j == 0) {
//                    count++;
//                    break;
//                }
//            }
//
//            if (count == 0) {
//                System.out.println(i+"is prime number");
//            }
//
//        }
        int a=1;
        int b=100;
        int i,j;

        for(i=a; i<=b;i++)
        {
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                    break;
            }
            if(i==j)
                System.out.println(j);
        }
    }
    }
