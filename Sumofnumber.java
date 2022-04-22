
/* Program to print the sum of two numbers using variables. */
import java.util.Scanner;
public class Sumofnumber
{
public static void main (String[] args)
{
	int x,y,sum;
	Scanner var=new Scanner(System.in); //creates an object of the scanner class 
	System.out.print("Enter the first number : ");
	x=var.nextInt();
	System.out.print("Enter the second number : ");
	y=var.nextInt();
	sum=sum(x,y);
	System.out.print(" Sum of two numbers : " + (sum));

}
//method sum that calculate the sum
public static int sum(int a, int b)
{
int sum = a+b;
return sum;
}
}
