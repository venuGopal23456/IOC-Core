package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Test/Bee.xml");
        test sfo = (test) context.getBean("t");
        System.out.println("Employee Details" + sfo);

    }
}
