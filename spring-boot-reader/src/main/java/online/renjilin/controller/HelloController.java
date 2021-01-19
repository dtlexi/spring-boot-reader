package online.renjilin.controller;

import online.renjilin.config.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	Person person;

	@RequestMapping("/hello")
	public String say()
	{
		System.out.println(this.person);
		return "Hello Service";
	}
}
