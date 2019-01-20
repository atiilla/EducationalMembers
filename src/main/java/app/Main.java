package app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.Address;
import model.Instructor;
import model.Student;

public class Main {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(config.class);

		Student student = ctx.getBean("Student", Student.class);
		Instructor teacher = ctx.getBean("Instructor", Instructor.class);

		// instructor -
		Address mTeacher = ctx.getBean("Address", Address.class);
		mTeacher.setCity("Brussel");
		mTeacher.setStreetname("Vrijstraat 16");

		teacher.setName("Alex");
		teacher.setInstructorId(1);
		teacher.setAdress(mTeacher);
		
		teacher.presentYourself(teacher);

		ctx.close();

	}

}
