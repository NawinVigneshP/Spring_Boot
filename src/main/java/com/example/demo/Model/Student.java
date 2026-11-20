package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
@Table(name="student_table")
public class Student {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name",nullable = false)
    private String name;

    @Column(name="Email", nullable = false,unique = true)
    private  String email;

    @Column(name="Phone", nullable = false, length=10)
    private String phone;

    private  int age;

    // @ManyToOne 
    // @Column(name="Department", nullable = false)
    // private int departmentID;

    @ManyToOne
    @JoinColumn(name = "Department", referencedColumnName = "DepartmentId", nullable = false)
    private Department department;
    
}
