package oops.object.composition;

public class RectangleRunner {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(12,34);
		System.out.println(rectangle);
		rectangle.setLength(40);
		System.out.println(rectangle);
	}

}
