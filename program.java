import java.util.Scanner;

//#include<stdio.h>#include<conio.h>
public class program
{
    public static void main(String[]args)
    {
Scanner scanner=new Scanner(System.in);  
System.out.print("Enter the number:");
double first=scanner.nextDouble();
double second=scanner.nextDouble();
// double third=scanner.nextDouble();
System.out.print("Enter an operator+,-,*,/):");
char operator=scanner.next().charAt(0);
double result;//system.out.printLn(math.abs(a+b));
//switch
switch(operator)
{
    case'+':
    result=first+second;
    break;
    case'-':
    result=first-second;
    break;
    case'*':
    result=first*second;
    break;
    case'/':
    result=first/second;
    break;

    default:
    System.out.printf("Error");
    return;
}
    

}
}