package com.atuluttam.projectProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class ProjectPropertyApplication {
	public static void main(String[] args) {
	ApplicationContext ctx =  SpringApplication.run(ProjectPropertyApplication.class, args);
	MyService ms =  ctx.getBean(MyService.class);
		System.out.println(ms.printMSG());
		ms.show();
	}

}
