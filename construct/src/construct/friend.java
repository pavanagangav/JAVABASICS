package construct;

public class friend {
	public static void main(String[] args) {
		friend p =new friend();
		friend a =new friend(2,5);
		String name="layala";
		int age=25;
		float height=5.5f;
		float weight=45;
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		
		
		
	}
	friend(){
		
		System.out.println("constructor");
	}
	friend(int a,int b)
	{
		System.out.println(a+b);
	}
}
