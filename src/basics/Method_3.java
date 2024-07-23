package basics;

public class Method_3 {
	  public static void m1(int i) {
	 if (i<1) {
		 return;
	 } 
	 m1(i-1);
	 System.out.println(i);
	  }
	public static void main(String[] args) {
		 Method_2.m1(10);

	

}
}