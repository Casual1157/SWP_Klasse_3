package rekursion;

public class PowerOf {
	
	public static int calculatePow(int n, int e) {
		if(e == 0) {		//Endbedingung
			return 1;
		}else {
			return n^calculatePow(n,e-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
