package interfaces;
interface ab{
	abstract void fox();
	static void fun() {
		System.out.println("static method 1");
	}
}
interface bc{
	abstract void box();
	static void bun() {
		System.out.println("static method 2");
	}
}
class apple implements ab,bc{
	public void fox() {
		System.out.println("fox method");
	}
	public void box() {
		System.out.println("Box method");
	}
}
public class multiple {
	public static void main(String[] args) {
		apple obj=new apple();
		obj.fox();
		obj.box();
		ab.fun();
		bc.bun();
	}

	}