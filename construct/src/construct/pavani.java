package construct;

public class pavani {
	public static void main(String[] args) {
		pavani p =new pavani();
		pavani a =new pavani(2,5);
		String name="pavani";
		int age=20;
		float height=5.2f;
		float weight=42;
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		
		
		
	}
	pavani(){
		
		System.out.println("constructor");
	}
	pavani(int a,int b)
	{
		System.out.println(a+b);
	}
}
