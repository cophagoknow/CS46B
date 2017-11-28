package transport;

public class Vehicle {
	private int nWheels;
	private double xPosition;
	private double yPosition;
	
	public Vehicle(int nWheels) {
		this.nWheels = nWheels;
		System.out.println("Vehicle ctor");
	}
	
	public void setPosition(double xPosition, double yPosition) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}
	
	public double getXPostion() {
		return xPosition;
	}
	
	public double getYPosition() {
		return yPosition;
	}
	
	public void changePositionBy(double xDelta, double yDelta) {
		this.xPosition += xDelta;
		this.yPosition += yDelta;
	}
}