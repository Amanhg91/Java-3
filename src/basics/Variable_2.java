package basics;

public class Variable_2 {
       static int data = 200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(Variable_2.data);
   Variable_2 obj = new Variable_2();
   Variable_2 obj2 = new Variable_2();
   Variable_2 obj3 = new Variable_2();
   System.out.println(obj.data);
   System.out.println("__________________");
   System.out.println("Before modification");
   System.out.println(obj.data);
   System.out.println(obj2.data);
   System.out.println(obj3.data);
	}

}
