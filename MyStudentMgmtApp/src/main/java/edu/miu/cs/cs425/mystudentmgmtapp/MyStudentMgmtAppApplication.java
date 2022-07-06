package edu.miu.cs.cs425.mystudentmgmtapp;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Student;
import edu.miu.cs.cs425.mystudentmgmtapp.model.Transcript;
import edu.miu.cs.cs425.mystudentmgmtapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;


@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {

	@Autowired//Field Injection
	private StudentService studentService;

	//@Autowired
	public MyStudentMgmtAppApplication(StudentService studentService){
		this.studentService = studentService;
	}

	public static void main(String[] args) {

		SpringApplication.run(MyStudentMgmtAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World SpringBoot!");
		//Student std1 = new Student(null, 614202, "Joan","Carter","Nash",3.45, LocalDate.of(2008,06,06));
		//System.out.println(createNewStudent(std1));
		//Student std2 = new Student(null, 614810, "John","Wills","Strong",2.87,LocalDate.of(2004,07,07));
		//System.out.println(createNewStudent(std2));
		printAllStudents();
		printStudentById(1L);
		printStudentById(10L);
		updateAndPrintStudentById(1L);
		//deleteStudentById(3L);
		System.out.println("Finished execution");
	}

	private Student createNewStudent(Student student){// C:Create
		return studentService.saveStudent(student);

	}

	private void printAllStudents(){// R:Read
		var students = studentService.getAllStudents();
		students.forEach(System.out::println);
	}

	private void printStudentById(Long studentId){
		var student = studentService.getStudentById(studentId);
		if(student != null){
			System.out.println(student);
		}else {
			System.out.printf("Student with StudentID: %d is not found!\n", studentId);
		}
	}

	private void updateAndPrintStudentById(Long studentId){
		var student = studentService.getStudentById(studentId);
		//student.setFirstName("Betty");


		var std1Transcript = new Transcript(null,"Nash Transcript",student);


		var updatedStudent = studentService.updateStudent(student);
		System.out.println(updatedStudent);
	}

	private void deleteStudentById(Long studentId){
		studentService.deleteStudentById(studentId);
	}

}
