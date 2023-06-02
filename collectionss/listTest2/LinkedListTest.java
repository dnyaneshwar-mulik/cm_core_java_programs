package collectionss.listTest2;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.add("Pune");
		linkedList.add("Bombay");
		linkedList.add("Nagpur");
		
		for (String string : linkedList) {
			System.out.println(string);
		}
		
	}

}
