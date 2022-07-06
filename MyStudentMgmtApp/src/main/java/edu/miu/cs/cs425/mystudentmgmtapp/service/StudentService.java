package edu.miu.cs.cs425.mystudentmgmtapp.service;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Student;

import java.util.List;

public interface StudentService {

    public abstract Student saveStudent(Student student);
    public abstract List<Student> getAllStudents();

    public abstract Student getStudentById(Long studentId);

    Student updateStudent(Student updatedstudent);

    void deleteStudentById(Long studentId);


}
