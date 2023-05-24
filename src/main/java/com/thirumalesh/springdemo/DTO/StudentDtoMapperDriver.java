package com.thirumalesh.springdemo.DTO;

public class StudentDtoMapperDriver {
	public static void main(String[] args) {
		StudentDtoMapper studentDtoMapper = new StudentDtoMapper();
		Student student = new Student(1, "John", "Doe", 27);
		StudentDto mappedDto = studentDtoMapper.objectToDto(student);
		System.out.println(mappedDto);

		Student mappedObject = studentDtoMapper.dtoToObject(mappedDto);
		System.out.println(mappedObject);

	}
}


//	mvn verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar -Dsonar.projectKey=spring-sonarcloud
