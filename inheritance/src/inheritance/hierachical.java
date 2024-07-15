package inheritance;
class parent{
	float height=5.3f;
	void weight() {
		System.out.println("parent weight is 60kgs");
	}
	parent(){
		System.out.println("constructor is invoked");
	}
}
	class child1 extends parent{
		String child1name="sindhu";
		void age(){
			System.out.println("age id child1 is  20");
		}
	}

	
class child2 extends parent{String child2name="Aravind";}

public class hierachical {
public static void main(String[] args) {
	child1 ch1=new child1();
	System.out.println(ch1.height);
	System.out.println(ch1.child1name);
	ch1.weight();
	ch1.age();
	child2 ch2=new child2();
	System.out.println(ch2.height);
	System.out.println(ch2.child2name);
}
}