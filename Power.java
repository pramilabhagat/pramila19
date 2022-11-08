import java.util.Scanner;
class Power
       {
                  public static void main(String args[])
                  {
                                Scanner s=new Scanner(System.in);
                                System.out.println("Enter a base");
                                int base=s.nextInt();

                                System.out.println("Enter a power");
                                int power=s.nextInt();
 
                                int ans=1;
                                for(int i=1;i<=power;i++)
                                {
                                              ans=ans*base;
                                }
                                System.out.println(ans);
                    }
        }