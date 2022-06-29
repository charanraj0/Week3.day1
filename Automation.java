package week3.day2;

public class Automation extends MultipleLanguage implements TestTool, Language{
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.selenium();
		auto.java();
		auto.python();
		auto.ruby();
		
	}

	@Override
	public void java() {
		System.out.println("Java is a language");
		
	}

	@Override
	public void python() {
		System.out.println("Python is a language");
		
	}

	@Override
	public void selenium() {
		System.out.println("Selenium is an Automation tool");
		
	}

}
