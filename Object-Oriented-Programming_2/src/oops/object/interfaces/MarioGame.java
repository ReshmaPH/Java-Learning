package oops.object.interfaces;

public class MarioGame implements GaminConsole_Example_to_Interface{

	@Override
	public void up() {
		System.out.println("Jump");
		
	}

	@Override
	public void down() {
		System.out.println("goes into hole");
		
	}

	@Override
	public void left() {
		
		
	}

	@Override
	public void right() {
		System.out.println("go forward");
		
	}
	
}
