package section3;

public class Speaking {
	public static void main(String[] args) {
		
speak("");
}
static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}