package inheritance;
class A{
	int a=77;
	void Abc() {
		System.out.println("parent class");
	}
	A(){
		System.out.println("constructor");
	}
}
class B extends A{
	int b=99;
	void Bcd() {
		super.Abc();
		System.out.println("child class");
	}
}

public class singleinher{
	public static void main(String[] args) {
		B obj=new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.Abc();
		obj.Bcd();
		A ob=new A();
		System.out.println(ob.a);
		ob.Abc(); 
	}

}
