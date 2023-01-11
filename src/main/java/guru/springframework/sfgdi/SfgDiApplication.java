package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController controller = ctx.getBean(MyController.class);
		System.out.println(controller.getGreeting());

		System.out.println("--------------Property based injection--------------------");

		PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------------Setter based injection--------------------");
		SetterInjectedController setterInjectedController =(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------------Constructor based injection--------------------");
		ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());

	}

}
