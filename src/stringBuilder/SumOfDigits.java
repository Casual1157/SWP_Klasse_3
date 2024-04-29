package stringBuilder;

public class SumOfDigits {
	
	public static int digitSum(String number) {
		if(number.isBlank()) {
			System.out.println("Bitte eine Zahl eingeben!");
			return 0;
		}
		else {
		     int sum = 0;
		     for (int i = 0; i < number.length(); i++) {
		          if (Character.isDigit(number.charAt(i))) {
		              sum += Character.getNumericValue(number.charAt(i));
		          }
		     }
		     return sum;

		}
	}
	
	public static void main(String[] args) {
		System.out.println(digitSum("35903"));
	}

}
