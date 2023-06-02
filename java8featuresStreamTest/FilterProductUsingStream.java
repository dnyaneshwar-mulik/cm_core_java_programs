package java8featuresStreamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterProductUsingStream {
	
	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();
		
		//Adding Products  
		productList.add(new Product(1,"HP Laptop",25000f));  
		productList.add(new Product(2,"Dell Laptop",30000f));  
		productList.add(new Product(3,"Lenevo Laptop",28000f));  
		productList.add(new Product(4,"Sony Laptop",28000f));  
		productList.add(new Product(5,"Apple Laptop",90000f));
		
		
		List<Float> productPriceList = productList.stream()
				.filter(p->p.price<30000) //data filtered
				.map(p->p.price)   // fetch price
				.collect(Collectors.toList()); //collect data
		
		System.out.println(productPriceList);
		
		//Filter and Iterate collection using Stream
		productList.stream()
		.filter(product -> product.price==90000)
		.forEach(product->System.out.println(product.name));
		
		
		//Sum using collectors
		
		double totalPrice = productList.stream()
				.collect(Collectors.summingDouble(product->product.price));
		
		System.out.println(totalPrice);
		
		//count
		
		long count = productList.stream()
		.filter(p->p.price<30000).count();
		
		System.out.println(count);
		
	}

}
