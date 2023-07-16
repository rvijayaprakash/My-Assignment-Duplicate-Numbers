package week1.day2;

public class Maths {

	public int add (int a, int b) {
		return a+b;
	}
	
	public int sub (int a, int b) {
		return a-b;
	}
	
	public int mul (int a, int b) {
		return a*b;
	}
	
	public int div (int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		
		Maths obj = new Maths();

		int sum = obj.add(23, 34);
		int sub = obj.sub(54, 37);
		int mul = obj.mul(7, 12);
		int div = obj.div(20, 5);
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
		

	}

}
