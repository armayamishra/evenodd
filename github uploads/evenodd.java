import java.util.Scanner;
class evenodd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter Number=");
n=sc.nextInt();
if(n%2==0)
{
System.out.println("Even");
}
else
System.out.println("Odd");
}
}