import java.util.Scanner;

public class ExceptionCalculator
{
public static void calculator(float a, float b, int ch)
{
float c;
switch(ch){
case 1:System.out.println(a+b);
break;
case 2:System.out.println(a-b);
break;
case 3:System.out.println(a*b);
break;
case 4:
try{
c=a/b;
System.out.println(c);
}
catch(ArithmeticException e)
{
System.out.println("b is 0");
}
break;
default:
System.out.println("Invalid Choice");
break;
}
}

public static void main(String args[])
{
float a,b;
int ch;
Scanner sc=new Scanner(System.in);

System.out.println("Enter a and b");
a=sc.nextFloat();
b=sc.nextFloat();

System.out.println("Menu");
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println("Enter choice");
ch=sc.nextInt();
calculator(a,b,ch);
}
}


