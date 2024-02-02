package com.assinment.switchcase;

import java.util.Scanner;
 
public class GeometryCalculatorSwitch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;

            System.out.println("--------------Geometry Calculator Menu:---------------");
            System.out.println("1. Area of a Circle");
            System.out.println("2. Area of a Square");
            System.out.println("3. Area of a Right-Angled Triangle");
            System.out.println("4. Area of a Rectangle");
            System.out.println("5. Circumference of a Circle");
            System.out.println("6. Perimeter of a Square");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the radius of the circle: ");
                    double radi = sc.nextDouble();
                    double circleArea = 3.14 * radi * radi;
                    System.out.println("Area of the circle: " + circleArea);
                    break;

                case 2:
                    System.out.println("Enter the side of the square: ");
                    double sideSq = sc.nextDouble();
                    double squareAr = sideSq * sideSq; 
                    System.out.println("Area of the square: " + squareAr);
                    break;

                case 3:
                    System.out.println("Enter the base of the triangle: ");
                    double base = sc.nextDouble();
                    System.out.println("Enter the height of the triangle: ");
                    double height = sc.nextDouble();
                    double triangleArea = 0.5 * base * height; 
                    System.out.println("Area of the right-angled triangle: " + triangleArea);
                    break;

                case 4:
                    System.out.println("Enter the length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.println("Enter the width of the rectangle: ");
                    double width = sc.nextDouble();
                    double area = length * width; 
                    System.out.println("Area of the rectangle: " + area);
                    break;

                case 5:
                    System.out.println("Enter the radius of the circle: ");
                    double radius = sc.nextDouble();
                    double circumference = 2 * 3.1415 * radius; 
                    System.out.println("Circumference of the circle: " + circumference);
                    break;

                case 6:
                    System.out.println("Enter the side of the square: ");
                    double squareSide = sc.nextDouble();
                    double perimeter = 4 * squareSide; //
                    System.out.println("Perimeter of the square: " + perimeter);
                    break;


                default:
                    System.out.println("Enter a valid option.");
            }
	}


}
