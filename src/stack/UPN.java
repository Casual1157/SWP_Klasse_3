package stack;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UPN {
	
	public static int calculateUPN(String input) {
        LinkedList<Integer> stack = new LinkedList<>();
        Pattern operatorPattern = Pattern.compile("[+*-/]");
        // operatorPattern: überprüft auf mathematische Rechenzeichen
        Pattern numericPattern = Pattern.compile("\\d+");
        // numericPattern: \\d...Ziffer [0-9], + beliebig viele Ziffern
        
        for(String token : input.split("\\s+")) {
        	Matcher operatorMatcher = operatorPattern.matcher(token);
        	Matcher numericMatcher = numericPattern.matcher(token);
        	if(numericMatcher.matches()) {
        		stack.push(Integer.parseInt(token));
        	} else if (operatorMatcher.matches()) {
        		int operand1 = stack.pop();
        		int operand2 = stack.pop();
        		int result = 0;
        		switch(token) {
        			case "+": result = operand1 + operand2; break;
        			case "-": result = operand1 - operand2; break;
        			case "*": result = operand1 * operand2; break;
        			case "/": result = operand1 / operand2; break;
        			default: System.out.println("Falscher Operator");
        		}
        		stack.push(result);
        	}
        }
        return stack.pop();
    }
	
	public static void main(String[] args) {
		String str = "5 3 +";
		System.out.println(calculateUPN(str));

	}

}