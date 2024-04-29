package rekursion;

public class FibonacciArray {

	public static int fibonacciArray(int n) {
		if(n<=1) {
			return n;
		}else {
			int[] fib = new int[n+1];
			fib[0] = 0;
			fib[1] = 1;
			for(int i=2; i<=n; i++) {
				fib[i] = fib[i-1] + fib[i-2];
			}
			return fib[n];
		}
	}
	public static void main(String[] args) {
		
		System.out.println(fibonacciArray(1000));
	}

}
