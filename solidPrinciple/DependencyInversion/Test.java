package solidPrinciple.DependencyInversion;

public class Test {

	public static void main(String[] args) {
		
		//IKeyBord bord = new KeyBoard();
		IMonitor monitor = new Monitor();
		IKeyBord bord = new NewKeyBord();
		
		
		WindowsMachine machine = new WindowsMachine(bord, monitor);
		
	}
}
