package online.renjilin.servletContextInitializer;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Component
public class TestServletContextInitializer implements ServletContextInitializer {
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("hello");
	}
}
