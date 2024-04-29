package stringBuilder;

public class HTML {
	
	public static String htmlElement(String tag, String body) {
		if(tag == " " || tag.isBlank()) {
			return body;
		}else if(body.isBlank()){
			return "<" + tag + ">" + "</" + tag + ">";
		}else {
			return tag = "<" + tag + ">" + body + "</" + tag + ">";
		}
	}
	
	public static String strong(String body) {
		return htmlElement("strong", body);
	}
	
	public static String emphasized(String body) {
		return htmlElement("em", body);
	}
	
	public static void main(String[] args) {
		System.out.println(strong(emphasized("strong and emphasized")));

	}

}
