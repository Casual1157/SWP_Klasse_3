package stringBuilder;

public class PasswordTester {

	public static boolean isGoodPassword(String input){
		if (input.length() < 8) {
            System.err.println("Das Passwort sollte mindestens 8 Zeichen lang sein.");
            return false;
        }else {
        	if (!input.matches(".*[a-z].*")) {
                System.err.println("Das Passwort sollte mindestens einen Kleinbuchstaben enthalten.");
                return false;
            }

            if (!input.matches(".*[A-Z].*")) {
                System.err.println("Das Passwort sollte mindestens einen Großbuchstaben enthalten.");
                return false;
            }

            if (!input.matches(".*\\d.*")) {
                System.err.println("Das Passwort sollte mindestens eine Zahl enthalten.");
                return false;
            }

            if (!input.matches(".*[!@#$%^&*()-_=+\\[\\]{};':\",.<>/?].*")) {
                System.err.println("Das Passwort sollte mindestens ein Sonderzeichen enthalten.");
                return false;
            } 
            System.out.println("Das Passwort ist gut genug");
            return true;
        }
	}
	
	public static void main(String[] args) {
		System.out.println(isGoodPassword("Passwort1234!"));
	}
}
