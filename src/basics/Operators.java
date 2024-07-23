package basics;

public class Operators {
public static void arithmetic() {
	int a=10; 
	int b=20; 
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
}
public static void relational() {
	int x =20;
	int y= 40;
	System.out.println(x>y);
	System.out.println(x>=y);
	System.out.println(x<y);
	System.out.println(x<=y);
	System.out.println(x==y);
	System.out.println(x!=y);
	System.out.println("________________");
}
public static void logical() {
	int x=25;
	int y=40;
	boolean result= !(!(x>y||(x==y)&&(x!=y)));
	System.out.println(result);
	System.out.println("_________________");
}
public static void ternary() {
	int x=21;
	int y=20;
	int result=(x>y)? 1 : 0;
	System.out.println(result);
	
}
public static void unary() {
	int a=10;
	int b =++a;
	System.out.println(a+" "+b);
	System.out.println("___________");
	
	int x=-12;
	int result = ~x;
	System.out.println(result);
}
public static void bitwise() {
	int a =10;
	int b =14;
	System.out.println(a&b);
	System.out.println(a|b);
	System.out.println(a^b);
}
public static void  shift() {
	int num=10;
	System.out.println(num<<2);
	
	int num1=200;
	System.out.println(num1>>5);
	System.out.println("____________________");
}
public static void assignment() {
	int a=10;
	a +=20;
	System.out.println(a);
}
public static void instanceOfOperation(){
	String str = "Java";
	if(str instanceof String) {
		System.out.println(str.length());
	}
}
public static void main (String []args) {
	Operators.arithmetic();
	Operators.relational();
	Operators.logical();
	Operators.ternary();
	Operators.unary();
	Operators.bitwise();
	Operators.shift();
	Operators.assignment();
	Operators.instanceOfOperation();
}
}
