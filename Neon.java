class Neon
{
public static void main(String args[])
{
     int num=9,sum=0;
  
     int sq=num*num;
    
     while(sq!=0)
       {
             int rem=sq%10;
             sum+=rem;
             sq/=10;
       }
           
        if(num==sum)
        {
                System.out.println("It is neon number");
        }
         else
        {
                System.out.println("It is not neon number");
        }
  }
}