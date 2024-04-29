package stringBuilder;

public class CamelCase {
	
	public static String camelCaseSplitter(String input) {
		String result = "";
		if(input.isBlank()) {
			System.err.println("Bitte eine Text eingeben");
		}
		else {
			String[] camelCase = input.split("(?=\\p{Lu})");
			for(int i = 0; i < camelCase.length; i++) {
				result += camelCase[i] + " ";
			}	
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(camelCaseSplitter("IWantToSplitThisText"));
	}

}
