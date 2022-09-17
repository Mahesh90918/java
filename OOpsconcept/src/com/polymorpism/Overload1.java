package com.polymorpism;

public class Overload1 {
	public double area() {
		double sides = 25.00;
		double square = 4 * sides;
		return square;
	}

	public double area(double radius) {
		final double PI = 3.14;
		double circleArea = PI * (radius * radius);
		return circleArea;
	}

	public double area(double length, double width) {
		double rectangleArea = length * width;
		return rectangleArea;
	}

	public static void main(String[] args) {
		Overload1 shape = new Overload1();
		double area = shape.area();
		System.out.println("area of sqaure is :" + area + " sqt");

		double cArea = shape.area(15.00);
		System.out.println("area of circle is :" + cArea + " sqt");

		double rArea = shape.area(30, 15);
		System.out.println("area of rectangle is :" + rArea + " sqt");

	}


}
