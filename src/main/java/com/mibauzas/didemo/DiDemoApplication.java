package com.mibauzas.didemo;

import com.mibauzas.didemo.controllers.MyController;
import com.mibauzas.didemo.examplebeans.FakeDatasource;
import com.mibauzas.didemo.examplebeans.FakeJmsBroker;

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

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsBroker.getUsername());

	}
}
