package oops.object.abstractexample;

public class Roses extends Flowers_Example_to_AbstractClass {
	public void smell()   // subclass has the implementation((overriding) of Abstract super class methods.
	{
		System.out.println("Beautiful Smell");
	}
	
	public static void main(String[] args) {
		Roses whiteRose=new Roses();
		whiteRose.smell();
	}
}
