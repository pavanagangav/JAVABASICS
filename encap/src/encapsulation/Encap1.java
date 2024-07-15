package encapsulation;
class nemo{
private int age=39;
private String name="pavani";
private float value=2.43f;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
	System.out.println(name);
}
public float getValue() {
	return value;
}
public void setValue(float value1) {
	this.value = value1;
	System.out.println(value);
}
//private Encap1() {
//	System.out.println(age);
//}
nemo(){
	System.out.println(age);
}
private void react() {
	System.out.println(age);
}
public int getage() {
	return age;
	
}
public int setage(int age1) {
	this.age=age1;
	return age;
}
}
public class Encap1 {
	
	public static void main(String[] args) {
		nemo ee=new nemo();
		System.out.println();
		System.out.println(23);
		System.out.println(ee.getage());
		System.out.println(ee.getName());
		System.out.println(ee.getValue());
		System.out.println(ee.setage(43));
		ee.setName("pavani");
		ee.setValue(45.8f);
//		System.out.println(ee.age);
//		ee.react();
//		
	}

	public char[] age;

	public void react() {
		// TODO Auto-generated method stub
		
	}

}