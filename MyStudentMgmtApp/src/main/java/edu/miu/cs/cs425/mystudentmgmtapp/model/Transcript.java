package edu.miu.cs.cs425.mystudentmgmtapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="transcript_id")
public class Transcript {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transcriptId;

    @Column(name = "degree_title")
    private String degreeTitle;


    @OneToOne(mappedBy = "transcript")
    private Student student;


}
