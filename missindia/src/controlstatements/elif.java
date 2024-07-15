package controlstatements;
import java.util.Scanner;

public class elif {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a value:");
		int a=sc.nextInt();
		System.out.println("enter the b value:");
		int b=sc.nextInt();
		System.out.println("enter the c value:");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
		
	}

}
