package abstraction;

abstract class i{
	abstract void mech();
	final void fun(){
		System.out.println("fun method");
		
	}
	i(){
		fun();
		System.out.println("i constructor");
	}
}
class j extends i{
	void mech() {
		System.out.println("mech method");
	}
}
public class abstractconcept { 
	public static void main(String[] args) {
		j ob=new j();
		ob.mech();
		ob.fun();
	}

}
