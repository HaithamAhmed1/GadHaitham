public class task3 {
    int number = 10;


    float sign = (int) (int) Math.signum(number);


switch (sign) {
        case 1:
            System.out.println("Число положительное.");
            break;
        case -1:
            System.out.println("Число отрицательное.");
            break;
        case 0:
            System.out.println("Число равно нулю.");
            break;
    }

}