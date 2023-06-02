package java8features1;

@FunctionalInterface
interface Drawable {
	public abstract void draw();
}
public class TestDrawLambada {
	public static void main(String[] args) {
		int width = 20;
		Drawable d = () -> {
			System.out.println("Width is - " + width);
		};
		d.draw();
	}

}
