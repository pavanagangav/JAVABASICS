package controlstatements;
import java.util.Scanner;
public class ifelse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int a = sc.nextInt();
		if(a%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		sc.close();
	}

}
