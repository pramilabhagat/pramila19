import java.util.Scanner;
class SumOfSquare
      {
                  public static void main(String args[])
                  {
                              Scanner s=new Scanner(System.in);
                              System.out.println("Enter a number");
                              int num=s.nextInt();

                              int sq=0;
                              while(num!=0)
                              {
                                             int rem=num%10;
                                             sq=(rem*rem)+sq;
                                             num/=10;
                              }
                              System.out.println(sq);
                   }
        }