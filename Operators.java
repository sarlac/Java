//Program to implement operators with mixed data types

public class Operators
{
public static void main(String[] args)
{
int x=5,y=7;
int sum1,sub1;
sum1=x+y;
System.out.println("Sum of two integer is integer : " + sum1 );

double a=3.7, b=8.0;
double sum2,sum3,sub2;
sum2=a+b;
System.out.println("Sum of two double is integer : " + sum2 );

sum3=x+b;
System.out.println("Sum of an integer and double is float : " + sum3);

sub1=x-y;
System.out.println("subtraction of two integer is integer : " + sub1);

sub2=a-b;
System.out.println("Subtraction of two double is double : " + sub2);

double multi;
multi=y*b;
System.out.println("Multiplication of a int and double is double: " + multi);

}
}