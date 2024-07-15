package controlstatements;
import java.util.Scanner;

public class Nestedif {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    
	System.out.println("Enter the height:");
	float height=sc.nextFloat();
	System.out.println("Enter the weight:");
	float weight=sc.nextFloat();
	
	if(height>=5.5 && height<=6.2) {
		if(weight<=60 && weight>=40) {
			System.out.println("eligible for competation");
		}
		else {
			if(weight>60)
			{
				System.out.println("over weight");
			}
			else
			{
				System.out.println("under weight");
			}
		}
	}
	else {
		if(height<5.5)
		{
			System.out.println("you are short");
		}
		else {
			System.out.println("you are tall");
		}
	}
	sc.close();
	
	
}
}
