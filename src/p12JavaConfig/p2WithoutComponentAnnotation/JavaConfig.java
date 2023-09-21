package p12JavaConfig.p2WithoutComponentAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Book getBook() {
		return new Book();
	}

//	@Bean("stu") // for having a custom name of bean
//	@Bean(name ={"student", "student2", "studt"}) // for having a custom name of bean
	@Bean //for having name of bean same as name of method
	public Student getStudent() {
		// creating new student object
		Student student = new Student(getBook());
		return student;
	}
}
