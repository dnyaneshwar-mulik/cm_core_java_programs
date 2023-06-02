package solidPrinciple.DependencyInversion;

public class WindowsMachine {
	
	//public KeyBoard keyBoard;
	//public Monitor monitor;
	
	public IKeyBord keyBoard;
	public IMonitor monitor;
	
	public WindowsMachine(IKeyBord iKeyBord, IMonitor monitor) {
		
		this.keyBoard = iKeyBord;
		this.monitor = monitor;
		
		//this.keyBoard = new KeyBoard();
		//this.monitor = new Monitor();
	}

}
