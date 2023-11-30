package com.mapping.onetooneunidirectional.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Data
@Table(name = "address")
public class Address {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addressId;
    private String street ;
    private String city;
    private String state ;


    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
