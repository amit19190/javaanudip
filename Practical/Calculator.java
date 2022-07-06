import java.util.Scanner;

public class Calculator
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter num1 : ");
int num1 = sc.nextInt();
System.out.println("enter num2 : ");
int num2 = sc.nextInt();
System.out.println("enter numbers (1,2,3,4)");
char numbers = sc.next().charAt(0);

int result;
switch (numbers)
{
case '1' :
result = num1+num2; 
break;

case '2' : 
result = num1-num2; 
break;

case '3' :
result = num1*num2; 
break;

case '4' :
System.out.println("quit");

default:
System.out.println("sorry! you entered incorrect number");
return;
}
System.out.println("the result is "+result);
}
}