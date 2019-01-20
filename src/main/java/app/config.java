package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import model.Address;
import model.Instructor;
import model.Student;

@Configuration
public class config {

	@Bean
	public Student Student() {
		Student temp = new Student();
		return temp;
	}

	@Bean
	public Instructor Instructor() {
		Instructor temp = new Instructor();
		return temp;
	}

	@Bean
    @Scope(value = "prototype")
    public Address Address() {
    	Address temp = new Address();
        return temp;
    }
}