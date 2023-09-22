import java.util.Scanner;

public class Task {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.println("a:");
 double a = scanner.nextDouble();

 System.out.println("b:");
 double b = scanner.nextDouble();

 double area1 = a * b;

 System.out.println("c:");
 double c = scanner.nextDouble();
  System.out.println("d:");
 double d = scanner.nextDouble();

 double area2 = c * d;

 if (area1 > area2) {
 System.out.println("The area of the first rectangle is larger than the area of the second rectangle");
 } else if (area1 < area2) {
 System.out.println("The area of the first rectangle is less than the area of the second rectangle");
 } else {
 System.out.println("The areas of the rectangles are equal");
 }
 }
}