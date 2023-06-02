package oop2.abstractionTest;
interface Language {
	
	 int a = 10;
	
	public abstract String getLanguage();

}
class English implements Language {

	@Override
	public String getLanguage() {
		
		return "English";
	}

}

class Marathi implements Language {

	@Override
	public String getLanguage() {
		
		return "Marathi";
	}

}

class Hindi implements Language{

	@Override
	public String getLanguage() {
		
		return "Hindi";
	}
}

public class Test {
	
	public static void main(String[] args) {
		
		Language obj = new Hindi();
		
		String val = obj.getLanguage();
		System.out.println(val);
		
		//Language.a = 20;
		
	}

}
