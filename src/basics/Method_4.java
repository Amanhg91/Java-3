package basics;

public class Method_4 {
	static int sum=0;
public static int getSum(int num){
	if(num>10) {
		return sum;
	}
	sum +=num;
	return getSum(num+1);
	
	
}
	public static void main(String[] args) {
		System.out.println(getSum(1));

	}

}
