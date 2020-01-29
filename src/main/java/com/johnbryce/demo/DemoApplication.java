package com.johnbryce.demo;

import com.johnbryce.demo.beans.*;
import com.johnbryce.demo.dao.AnimalDAO;
import com.johnbryce.demo.repo.AnimalRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =  SpringApplication.run(DemoApplication.class, args);

//		Person p1 = ctx.getBean(Person.class);
//////		System.out.println(p1);
//////
//////		Person p2 = ctx.getBean(Person.class);
//////		System.out.println(p2);


		SingletonBean s1 = ctx.getBean(SingletonBean.class);
		System.out.println(s1.getX());
		SingletonBean s2 = ctx.getBean(SingletonBean.class);
		System.out.println(s2.getX());

		PrototypeBean p1 = ctx.getBean("prototypeBean",PrototypeBean.class);
		System.out.println(p1.getX());
		PrototypeBean p2 = ctx.getBean("prototypeBean",PrototypeBean.class);
		System.out.println(p2.getX());


		PrototypeBean p3 = ctx.getBean("protoSix",PrototypeBean.class);
		System.out.println(p3.getX());


		ComposedBean c1 = ctx.getBean(ComposedBean.class);
		System.out.println(c1.getN1().getX());
		System.out.println(c1.getPrototypeBean().getX());
		System.out.println(c1.getProtoSix().getX());


		AnimalDAO dao = ctx.getBean(AnimalDAO.class);
		Animal a1 = new Animal();
		a1.setGender("male");
		a1.setId(111);
		a1.setName("duly");
		dao.insert(a1);


		RestTemplate restTemplate = new RestTemplate();
		System.out.println(restTemplate.getForObject("http://localhost:8080/hi",String.class));





	}

	@GetMapping("/hi")
	public String sayHello(){
		return "Hello World";
	}

	@GetMapping("/all")
	public List<Person> getAll(){
		Person p1 = new Person();
		Person p2 = new Person();
		return Arrays.asList(p1,p2);
	}
	@Bean
	public PrototypeBean protoSix(){
		PrototypeBean prototypeBean = new PrototypeBean();
		prototypeBean.setX(6);
		return prototypeBean;
	}

}
