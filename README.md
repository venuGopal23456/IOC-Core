# IOC-Core

This Project about the IOC core container of BeanFactory and Application Context.

Bean Factory-Lazy Loading.
Application Context-Eager Loading.
During the scope is prototype even the Application Context behave as BeanFactory.
By using Spring we can able to Access the Private constructor which is not done by clss.forname().newInstance.

Steps
1)Create the Test class(POJO class).
2)Create the clint class(which is main class).
3)Create XML file which is for Parsing data.

4)Add the Required Dependencies such as 
   a)commons-logging
   b)spring-core.
   c)spring-context.
   d)spring-bean.
5)Change the Scope form Singleton and Prototype and vice versa.
6)Singleton-Create One Instance.
7)Prototp=ype-Create Multiple Instance upon each user Request.

Miscellaneous
Application Context is the implementation of the Bean Factory.

Each Interface Triggered by the implemented class for eg

1)BeanFactory(I) is Triggered by the XmlBeanFactory.
2)ApplicationContext(I) is Triggered by the ClassPathXmlApplicationContext.
3)WebApplicatonContext(I) is Triggered by the WebApplicationContext.
    
    
