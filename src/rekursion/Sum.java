package rekursion;

public class Sum {
	
	public static int calculateSum(int n) {
		if(n==0) {		//Endbedingung
			return 1;	//
		}else {
			return n + calculateSum(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
