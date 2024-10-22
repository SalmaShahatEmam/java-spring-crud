package com.spring.wev.Models;

import jakarta.persistence.*;

import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Teacher {
    @Id
    //  @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private long id;
    private int SALARY;
    private String name;

    public int getSALARY() {
        return SALARY;
    }

    public void setSALARY(int SALARY) {
        this.SALARY = SALARY;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private String subject;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



