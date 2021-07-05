package oops.object.composition;

public class FanRunner {

	public static void main(String[] args) {
		Fan  fan=new Fan("usha",0.34,"Green");
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte)20);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
		

	}

}
