package java8features;

interface Draw{
	
	public abstract void draw();
	
}

public class TestDrawNoLambada {
	
	public static void main(String[] args) {
		
		int width = 20;
		
		Draw d = new Draw() {
			
			@Override
			public void draw() {
				System.out.println("Width is -"+width);
				
			}
		};
		
		d.draw();
		
	}

}
