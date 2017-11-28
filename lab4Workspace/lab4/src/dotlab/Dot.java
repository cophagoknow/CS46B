package dotlab;

import java.util.Arrays;

public class Dot 
{
	private static String[] 	LEGAL_COLOR_NAMES =
	{
		"RED", "YELLOW", "BLUE", "CYAN", "GREEN", "MAGENTA", "ORANGE", "BLACK"
	};

	private String colorName;
	private int x;
	private int y;
	private int radius;
	
	public Dot(String colorName, int x, int y, int radius) throws IllegalArgumentException {
		if (Arrays.asList(Dot.LEGAL_COLOR_NAMES).contains(colorName)) {
			this.colorName = colorName;
		} else {
			throw new IllegalArgumentException(colorName + " is not a legal color name.");
		}
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String getColorName() {
		return this.colorName;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public String toString() {
		return "Color: "+this.colorName+"\n X: "+this.x+"\n Y: "+this.y+"\n Radius:"+this.radius;
	}
	
	public static void main(String[] args) {
		Dot a = new Dot("RED", 1, 1, 1);
		System.out.println(a);
	}
}
