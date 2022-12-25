package de.tekup.studentsabsence.services;

import de.tekup.studentsabsence.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student getStudentBySid(Long sid);

    Student addStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudent(Long sid);
}
