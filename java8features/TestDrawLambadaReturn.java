package java8features;


@FunctionalInterface
interface Drawable1{
	
	public abstract int draw();
	
}

public class TestDrawLambadaReturn {
	
	public static void main(String[] args) {
		
		int width = 20;
		
		Drawable1 d = () -> {
			
			System.out.println("in draw method");
			return width;
		};
		
		System.out.println(d.draw());
		
	}

}
