package com.spring.wev.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class std {

    @Id
    //  @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private long id;
    private int salary ;
    private String name ;
}
