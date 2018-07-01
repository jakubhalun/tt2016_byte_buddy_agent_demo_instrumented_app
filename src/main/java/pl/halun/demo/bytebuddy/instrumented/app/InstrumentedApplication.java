package pl.halun.demo.bytebuddy.instrumented.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class InstrumentedApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstrumentedApplication.class, args);
	}

}
