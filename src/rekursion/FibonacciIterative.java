package rekursion;

public class FibonacciIterative {

	public static int fibonacciIterative(int n) {
		if(n<=1) {
			return n;
		}else {
			int fib0 = 0;
			int fib1 = 1;
			for(int i=2; i<=n; i++) {
				int temp = fib1;
				fib1 += fib0;
				fib0 = temp;
			}
			return fib1;
		}
	}
	
	public static void main(String[] args) {

		System.out.println(fibonacciIterative(1000));
	}

}
