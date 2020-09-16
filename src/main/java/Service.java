import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springCoffee-context.xml");

        MilkCoffee milkCoffee = context.getBean(MilkCoffee.class);

        System.out.println("milkcoffee =" + milkCoffee);



    }
}
