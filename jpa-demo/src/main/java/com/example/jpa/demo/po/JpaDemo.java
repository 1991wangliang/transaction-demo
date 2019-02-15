package com.example.jpa.demo.po;

import javax.persistence.*;

@Entity(name = "t_demo")
@Table
public class JpaDemo {

    private Integer id;
    private String name;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
