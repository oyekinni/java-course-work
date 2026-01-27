import java.util.Scanner;

public class TestTriangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter side1: ");
    double side1 = input.nextDouble();

    System.out.print("Enter side2: ");
    double side2 = input.nextDouble();

    System.out.print("Enter side3: ");
    double side3 = input.nextDouble();

    input.nextLine(); // clear newline

    System.out.print("Enter a color: ");
    String color = input.nextLine();

    System.out.print("Is the triangle filled? (true/false): ");
    boolean filled = input.nextBoolean();

    Triangle triangle = new Triangle(side1, side2, side3);
    triangle.setColor(color);
    triangle.setFilled(filled);

    System.out.println();
    System.out.println(triangle.toString());
    System.out.printf("Area: %.3f%n", triangle.getArea());
    System.out.printf("Perimeter: %.3f%n", triangle.getPerimeter());
    System.out.println("Color: " + triangle.getColor());
    System.out.println("Filled: " + triangle.isFilled());

    input.close();
  }
}
