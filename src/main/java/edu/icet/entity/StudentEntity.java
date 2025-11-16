package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="student")
public class StudentEntity {
    @Id
    private Integer id;
    private String fristName;
    private String lastName;
    private  String email;
    private String phoneNumber;
    private String address;
    private String gender;
    private  String status;
    private LocalDate dateOfBirth;
    private LocalDate admissionDate;

}
