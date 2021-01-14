package online.renjilin;

import online.renjilin.config.Person;
import online.renjilin.service.ConditionalService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class test {
	@Autowired
	private Person person;

	@Autowired
	private ConditionalService conditionalService;
	@Test
	public void test()
	{
//		System.out.println(this.person);
		System.out.println(conditionalService);
	}
}
