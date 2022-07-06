package edu.miu.cs.cs425.mystudentmgmtapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="class_rooms")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classroomId;

    private String buildingName;

    private Integer roomNumber;

    @OneToMany
    @JoinColumn(name="student_id")
    private Student student;

}
