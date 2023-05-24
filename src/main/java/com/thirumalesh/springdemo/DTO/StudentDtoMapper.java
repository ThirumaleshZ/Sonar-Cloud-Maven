package com.thirumalesh.springdemo.DTO;

public class StudentDtoMapper {
	public Student dtoToObject(StudentDto studentDto) {
		Student student = new Student(studentDto.getId(), studentDto.getFirstName(), studentDto.getLastName(), studentDto.getAge());
		return student;
	}

	public StudentDto objectToDto(Student student) {
		StudentDto studentDto = new StudentDto(student.getId(), student.getFirstName(), student.getLastName(), student.getAge());
		return studentDto;
	}
}
