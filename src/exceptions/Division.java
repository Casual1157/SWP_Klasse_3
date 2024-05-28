package exceptions;

public class Division {

	public static int divide(int x, int y) {
		int res;
		try {
			res = x/y;
			System.out.println(res);
		}catch(ArithmeticException e) {
			res = 0;
			System.err.println("Division mit null ist unmöglich!");
		}
		return res;
	}
	
	public static void main(String[] args) {
		divide(25, 5);
		divide(5, 0);
		divide(9, 3);
	}

}
