import java.util.Scanner;
class LeapYear
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int num=s.nextInt();
if((num%4==0&&num%100!=0)||num%400==0)
{
System.out.println("It is a leap year");
}
else
{
System.out.println("It is not a leap year");
}
}}