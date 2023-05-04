package edu.soundbeatsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SoundBeatsApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SoundBeatsApplication.class, args);
	}
}
