package com.mibauzas.didemo;

import com.mibauzas.didemo.controllers.ConstructorInjectedController;
import com.mibauzas.didemo.controllers.MyController;
import com.mibauzas.didemo.controllers.PropertyInjectedController;
import com.mibauzas.didemo.controllers.SetterInjectedController;
import com.mibauzas.didemo.examplebeans.FakeDatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDatasource fakeDatasource = (FakeDatasource) ctx.getBean(FakeDatasource.class);

		System.out.println(fakeDatasource.getUser());

	}
}
