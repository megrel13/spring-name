import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Service {
    public static void start(ApplicationContext context) {
        System.out.println("Good time of day! Which kind of coffee you want? With milk or with cream?");

        Scanner scanner = new Scanner(System.in);
        String clientsChoice = scanner.nextLine();

        System.out.println("Your choice: " + clientsChoice);


        if (clientsChoice.toLowerCase().contains("milk")) {
            MilkCoffee milkCoffee = context.getBean(MilkCoffee.class);
            System.out.println("Your own coffee with milk" + milkCoffee.toString());
        } else {
            Coffee coffee = context.getBean(Coffee.class);
            System.out.println("Your own coffee with cream" + coffee.toString());
        }
    }
}
