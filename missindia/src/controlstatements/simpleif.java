package controlstatements;
import java.util.Scanner;
public class simpleif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int a = sc.nextInt();
		if(a>25) 
			System.out.println("not eligible");
		
		sc.close();
	}

}
