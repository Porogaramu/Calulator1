import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first value");
        double value1 = scanner.nextDouble();

        System.out.println("Input second value");
        double value2 = scanner.nextDouble();

        double sum          = value1 + value2;
        double difference   = value1 - value2;
        double product      = value1 * value2;
        

        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The product is " + product);

        System.out.println("---------------------------------------------------------------------");

        System.out.println("Input Length");
        double length = scanner.nextDouble();

        System.out.println("Input Width");
        double width = scanner.nextDouble();

        double perimeter = length * 2 + width * 2;

        System.out.println("The perimeter of this rectangle is " + perimeter);

        scanner.close();
    }
}
