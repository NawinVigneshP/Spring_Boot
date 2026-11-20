package com.example.demo.Model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
@AllArgsConstructor 
@Entity
@Table(name="Department")
public class Department {

        @Id 
        @Column(name="DepartmentId", nullable = false,unique = true)
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;

        @Column(name = "Departname", nullable = false, unique = true)
        private String deptName;

        @Column(name = "HOD", nullable = false)
        private String hodName;

}
