import java.util.Scanner;
class SumOfDigit
      {
                   public static void main(String args[])
                   {
                             Scanner s=new Scanner(System.in);
                             System.out.println("Enter a number");
                             int num=s.nextInt();

                             int sum=0;
                             while(num!=0)
                             {
                                       int rem=num%10;
                                       sum=sum+rem;
                                       num/=10;
                             }
                             System.out.println(sum);
                   }
        }