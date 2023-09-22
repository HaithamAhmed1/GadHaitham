import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину первой стороны основания: ");
        double side1 = scanner.nextDouble();

        System.out.print("Введите длину второй стороны основания: ");
        double side2 = scanner.nextDouble();

        System.out.print("Введите угол между сторонами основания (в градусах): ");
        double angle = Math.toRadians(scanner.nextDouble());

        System.out.print("Введите высоту параллелепипеда: ");
        double height = scanner.nextDouble();

        // Вычисляем площадь основания
        double baseArea = side1 * side2 * Math.sin(angle);

        // Вычисляем объем параллелепипеда
        double volume = baseArea * height;

        System.out.println("Объем параллелепипеда: " + volume);
    }
}