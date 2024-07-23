package basics;

public class Method_1 {
	public void m1() {
		System.out.println("m1() called");
	}
 public static void m2() {
	 System.out.println("m2() called");
	 
 }
 public void add (int n1, int n2) {
	 System.out.println(n1+n2);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_1 obj = new Method_1();
		obj.m1();
		Method_1.m2();		
      obj.add(12, 13);
 }
	

}
