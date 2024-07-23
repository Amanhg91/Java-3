package basics;

public class Method_2 {
     public static void m1(int i) {
    	 if (i>10) {
    		 return;
    	 } 
    	 m1(i+1);
    	 System.out.println(i);	
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Method_2.m1(1);
	}

}
      