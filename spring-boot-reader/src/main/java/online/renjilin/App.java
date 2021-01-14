package online.renjilin;

import online.renjilin.conditional.TestConditional;
import online.renjilin.service.ConditionalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}

//	@Bean
//	@Conditional(TestConditional.class)
//	public ConditionalService createConditionalService()
//	{
//		return  new ConditionalService();
//	}
}
