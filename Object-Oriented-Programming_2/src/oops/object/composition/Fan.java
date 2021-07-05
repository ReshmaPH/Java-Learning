package oops.object.composition;

public class Fan {
	//state
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;
	
	//creation
	
	public Fan(String make,double radius,String color) {
		this.make=make;
		this.radius=radius;
		this.color=color;
	}
	
	//Print Object
	
	public String toString() {
		return String.format("Make -%s,Radius - %f,Color -%s,IsOn - %b,Speed -%d",make,radius,color,isOn,speed);
	}
	
	public void switchOn() {
		this.isOn=true;
		setSpeed((byte)5);
	}
	
	public void switchOff() {
		this.isOn=false;
		setSpeed((byte)0);
	}

	public void setSpeed(byte speed) {
	
		this.speed=speed;
	}
	
	
	

}
