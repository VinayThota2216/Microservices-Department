package com.vinay.department.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private int countOfEmployees;
    private String departmentNumber;


}
