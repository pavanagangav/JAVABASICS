package abstraction;
abstract class frnd{
	int a=10;
	abstract void fun();
	abstract void run();
	abstract void eat();
	final void water() {
		System.out.println("drink water");
	}
	final void fridge(){
		System.out.println("fridge");
	}
	
}
	class frnds extends frnd{
		void fun() {
			System.out.println("fun method");
		}
		void run()
		{
			System.out.println("run method");
			}
		void eat()
		{
			System.out.println("eat method");
			}
		frnds(){
			fridge();
			System.out.println("constructo 1");
		}
		frnds(int a,int b)
		{
			
			System.out.println(a+b);
		}
		}
	

public class abstractconcept2 {
	public static void main(String[] args) {
		frnds ob=new frnds();
		frnds ob2=new frnds(2,3);
		
		ob.fun();
		ob.run();
		ob.eat();
		ob.water();
		ob.fridge();
		
	}

}
