package com.sam.springbootJDBC;

import com.sam.springbootJDBC.model.Student;
import com.sam.springbootJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootJdbcApplication {

	public static void main(String[] args) {

		/*Simple JDBC and H2 (InMemory) Database Demo*/ /*H2 is Commented in pom.xml*/
		/*Simple JDBC and Postgres Database Demo*/

		ApplicationContext context = SpringApplication.run(SpringbootJdbcApplication.class,args);
		Student student1 = context.getBean(Student.class);
		student1.setRollNo(5);
		student1.setName("sam1");
		student1.setMarks(50);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(student1);
		System.out.println(service.getStudents());
	}

}
