package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
       /* Resource resource=new ClassPathResource("Resource/spring.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        factory.getBean("t");
        factory.getBean("t");
*/
        ApplicationContext context = new ClassPathXmlApplicationContext("Resource/spring.xml");
        //test sfo = (test) context.getBean("t");
        //System.out.println("Employee Details" + sfo);
        /*context.getBean("t");
        context.getBean("t");
*/
    }


}
