package entities;

public class Rectangle {
	public double Width;
	public double Height;

	public double Area() {
		return Width * Height;
	}

	public double Perimeter() {
		return (Width * 2) + (Height * 2);
	}

	public double Diagonal() {
		return Math.sqrt(Math.pow(Width, 2) + Math.pow(Height, 2));
	}

}
