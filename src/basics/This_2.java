package basics;
class Pen{
	

Pen(){
	System.out.println("no-arg construvtor called");
}
Pen(int a){
	this();
	System.out.println("one-arg constructor called");
}
}
public class This_2 {
public static void main(String[]args) {
	Pen p = new Pen (3);
}
}
