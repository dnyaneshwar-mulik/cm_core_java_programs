package java8featuresStreamTest2.otherJava8Features;

import java.util.ArrayList;
import java.util.List;

public class ForEachTest {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Suraj");
		names.add("Sagar");
		names.add("Sushma");
		names.add("Amruta");
		names.add("Swati");
		
		names.forEach(n->System.out.println(n));
		
		names.forEach(System.out::println);
		
		
	}

}
