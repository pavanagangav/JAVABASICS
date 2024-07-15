package polymorphism;

class collage{
	void student() {
		System.out.println("collage class");
		
	}
	
}

class school extends collage{
	void student() {
		System.out.println("school class");
		
	}
	
}
class park extends collage{
	void student() {
		System.out.println("class park");
		
	}
	
}

public class overriding {
	public static void main(String[] args) {
		collage obj1;
		obj1= new school();
		obj1.student();
		obj1= new collage();
		obj1.student();
		obj1= new park();
		obj1.student();
		
		
		
		
		
		
	}
	

}