package encapsulation1;

import encapsulation.Encap1;

class neon extends  Encap1{
	void gas() {
		Encap1 rr=new Encap1();
		System.out.println(age);
		rr.react();
	}
}
public class subclass {
	public static void main(String[] args) {
		
		neon n =new neon();
		n.gas();
	}

}
