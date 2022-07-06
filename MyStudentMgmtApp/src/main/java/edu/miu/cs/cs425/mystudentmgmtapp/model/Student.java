package edu.miu.cs.cs425.mystudentmgmtapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column(name = "student_number", nullable = false)
   // @NotNull(message = "Student Number cannot be null")
   // @NotEmpty(message = "Student Number cannot be empty")
   // @NotBlank(message = "Student Number cannot be blank spaces")
    private Integer studentNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transcriptId")
    private Transcript transcript;


    @ManyToOne
    private Classroom classroom;


    @Column(name = "first_name", nullable = false)
    @NotNull(message = "First Name cannot be null")
    @NotEmpty(message = "First Name cannot be empty")
    @NotBlank(message = "First Name cannot be blank spaces")
    private String firstName;


    @Column(name = "middle_name", nullable = true)
    private String middleName;

    @Column(name = "last_name", nullable = false)
    @NotNull(message = "Last Name cannot be null")
    @NotEmpty(message = "Last Name cannot be empty")
    @NotBlank(message = "Last Name cannot be blank spaces")
    private String lastName;

    @Column(name = "cgpa")
    private Double cgpa;

    @Column(name = "date_of_enrollment")
    private LocalDate dateOfEnrollment;

    public Student (){
        this(null,null,null,null,null, null, null);

    }

    public Student(Long studentId, Integer studentNumber, String firstName, String middleName, String lastName, Double cgpa, LocalDate dateOfEnrollment) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }


}
