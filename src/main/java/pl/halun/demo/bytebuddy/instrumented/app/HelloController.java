package pl.halun.demo.bytebuddy.instrumented.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static final String template = "Hello, %s!";

	@RequestMapping("/hello")
	public String greeting(
			@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format(template, name);
	}

	@RequestMapping("/browser")
	public String showUserAgent(HttpServletRequest request) {
		return request.getHeader("user-agent");
	}

}
