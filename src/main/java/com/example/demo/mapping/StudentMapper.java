package com.example.demo.mapping;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student) {
        StudentDto studentDto = new StudentDto(student.getRollNo(), student.getFirstName(), student.getLastName(),
                student.getEmail());
        return studentDto;

    }

    public static Student mapToStudent(StudentDto studentDto) {
        Student student = new Student(studentDto.getRollNo(), studentDto.getFirstName(), studentDto.getLastName(),
                studentDto.getEmail());
        return student;
    }

}
