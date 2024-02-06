package com.JobsPortalServer.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
//    Write name here
    private tushar = 'Tushar'

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
