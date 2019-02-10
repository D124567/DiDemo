package guru.springframework;

import guru.springframework.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");

		myController.hello();

		System.out.println(context.getBean(PropertyInjectedController.class).sayGreeting());
		System.out.println(context.getBean(SetterInjectedController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectedController.class).sayGreetings());
		System.out.println(context.getBean(PrimaryController.class).sayHello());


	}
}
