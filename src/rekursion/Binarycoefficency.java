package rekursion;

public class Binarycoefficency {
	
	public static int calculateBinary(int n, int k) {
		if(k == 0 || k == n) {
			return 1;
		}else {
			return (calculateBinary(n-1, k-1) + calculateBinary(n-1, k));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateBinary(10, 1));
	}

}
