package com.jobserviceapi.store.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "job")
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "job_id_gen")
    @SequenceGenerator(name = "job_id_gen", sequenceName = "job_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "experience")
    private Double experience;

    @Column(name = "title", nullable = false, length = 500)
    private String title;

    @Column(name = "max_salary")
    private Integer maxSalary;

    @Column(name = "min_salary")
    private Integer minSalary;

}