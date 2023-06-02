package java8featuresStreamTest2.methodRefTest;

public class Message {
	
	public Message(String msg) {
		System.out.println(msg);
	}
	
	
	public static void main(String[] args) {
		
		Messageable msg = Message::new;
		
		msg.getMessage("Hello");
		
	}

}
