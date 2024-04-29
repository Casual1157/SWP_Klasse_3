package tasks;

import java.util.Scanner;

//import java.util.Scanner;
//import java.util.Stack;
//
//public class UPNTaschenrechner {
//     
//       public static double calculate() {
//    	   Scanner sc = new Scanner(System.in);
//    	   String ausdruck = sc.nextLine();
//    	   sc.close();
//            Stack<Double> stack = new Stack<>();   
//            String[] tokens = ausdruck.split(" ");
//            for (String token : tokens) {
//                if (isNumber(token)) {
//                    double number = Double.parseDouble(token);
//                    stack.push(number);
//                } else {
//                    double number2 = stack.pop();
//                    double number1 = stack.pop();
//                    double result = 0;
//                    switch (token) {
//                        case "+":
//                            result = number1 + number2;
//                            break;
//                        case "-":
//                            result = number1 - number2;
//                            break;
//                        case "*":
//                            result = number1 * number2;
//                            break;
//                        case "/":
//                            result = number1 / number2;
//                            break;
//                        default:
//                            System.err.println("Ungültige number: " + token);
//                    }
//                    stack.push(result);
//                }
//            }
//            return stack.pop();
//       }
//        
//        private static boolean isNumber(String str) {
//            if (str.length() == 0 || (str.length() > 1 && str.charAt(0) == '-')) {
//                return false;
//            }
//            for (int i = (str.charAt(0) == '-') ? 1 : 0; i < str.length(); i++) {
//                if (!Character.isDigit(str.charAt(i))) {
//                    return false;
//                }
//            }
//            return true;
//        }
//    }

import java.util.Stack;

public class UPNTaschenrechner {
	

    public static double evaluate() {
    	boolean active = true;
    	Stack<Double> stack = null;
    	double prvs = 0;
    	while(active) {
    		System.out.println("Berechnung:");
    		Scanner sc = new Scanner(System.in);
        	String expression = sc.nextLine();
        	switch(expression) {
        	case "esc": sc.close(); return stack.pop();
        	case "prvs": stack.push(prvs); break;
        	} 
        	sc.close();
            stack = new Stack<>();

            String[] tokens = expression.split(" ");

            for (String token : tokens) {
                if (isNumber(token)) {
                    stack.push(Double.parseDouble(token));
                } else {
                    double operand2 = stack.pop();
                    double operand1 = stack.pop();

                    switch (token) {
                        case "+":
                            stack.push(operand1 + operand2);
                            break;
                        case "-":
                            stack.push(operand1 - operand2);
                            break;
                        case "*":
                            stack.push(operand1 * operand2);
                            break;
                        case "/":
                            stack.push(operand1 / operand2);
                            break;
                        // Weitere Operatoren können hier hinzugefügt werden
                        default:
                            throw new IllegalArgumentException("Ungültiger Operator: " + token);
                    }
                }
            }
            prvs = stack.pop();
            System.out.println(stack.pop());
    	}
        return stack.pop();
    }

    private static boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
