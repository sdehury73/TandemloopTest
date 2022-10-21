package test;
import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number(a)");
		double a=s.nextInt();
		System.out.println("Enter the second number(b)");
		double b=s.nextInt();
		System.out.println("Enter the type of operation");
		String operator=s.next();
		switch(operator)
		{
		case "+":System.out.println("Answer is "+(a+b));
		break;
		case "-":System.out.println("Answer is "+(a-b));
		break;
		case "*":System.out.println("Answer is "+(a*b));
		break;
		case "/":System.out.println("Answer is "+(a/b));
		}
	}
}
