package p12JavaConfig.p2WithComponentAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Student {
	public void study() {
		System.out.println("Student is studying...");
	}
}
