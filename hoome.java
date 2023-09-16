import java.util.Scanner;

public class hoome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your body temperature: ");
        double temperature = scanner.nextDouble();

        if (temperature == 36) {
            System.out.println("Is healthy");
        } else if ((temperature >= 36 && temperature < 34) || (temperature > 36 && temperature <= 42)) {
            System.out.println("Is sick");
        } else {
            System.out.println("Is Dead");
        }
    }
}