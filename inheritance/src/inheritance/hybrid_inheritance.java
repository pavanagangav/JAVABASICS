package inheritance;
class x{int i=23;}
class y extends x{float r=54.8f;}
class z extends y{String c="Hello";}
class w extends x{double p=98.122;}
class s{int s=45;}
class q extends s{String q="queen";}

public class hybrid_inheritance {
public static void main(String[] args) {
	z ob1=new z();
	System.out.println(ob1.c);
	System.out.println(ob1.i);
	System.out.println(ob1.r);
	q ob2=new q();
	System.out.println(ob2.q);
	System.out.println(ob2.s);
	w ob3=new w();
	System.out.println(ob3.p);
	System.out.println(ob3.i);
}
}
