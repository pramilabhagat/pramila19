import java.util.Scanner;
class Square
{
            public static void main(String args[])
             {
                      Scanner s=new Scanner(System.in);
                      System.out.println("Enter a Number");
                      int Num=s.nextInt();
                      int res=0;
                      while(Num!=0)
                      {
                          int rem=Num%10;
                          res=(rem*rem)+res;
                          Num/=10;
                      }
                      System.out.println(res);
            }
}