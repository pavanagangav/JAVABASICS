package polymorphism;

class complie{
	void cherry() {
		System.out.println("method with no paremetrrs");
		
	}
	int cherry(int a) 
	
	{
		System.out.println("method having 1 paremeter");
		return a;
		
		
	}
    void cherry(int a,int b) {
    	System.out.println("method with 2 parameters");
		
	}
}

public class overrloading {
	public static void main(String[] args) {
		complie obj=new complie();
		obj.cherry();
		System.out.println(obj.cherry(40));
	    obj.cherry(4,8);
		
	}

}