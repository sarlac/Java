// switch to find number of month by passing month name

public class Switch01
{
public static void main(String[] args)
{
String month = "march"; 
switch(month)
{
case "jan" : System.out.println("Month number 1");
			 break;
case "feb" : System.out.println("Month number 2");
			 break;
case "mar" : System.out.println("Month number 3");
			 break;
case "apr" : System.out.println("Month number 4");
			 break;
case "may" : System.out.println("Month number 5");
			 break;
case "june" : System.out.println("Month number 6");
			 break;
case "july" : System.out.println("Month number 7");
			 break;
case "aug" : System.out.println("Month number 8");
			 break;
case "sept" : System.out.println("Month number 9");
			 break;
case "oct" : System.out.println("Month number 10");
			 break;
case "nov" : System.out.println("Month number 11");
			 break;
case "dec" : System.out.println("Month number 12");
			 break;
default:	System.out.println("Invalid month");
}
}
}