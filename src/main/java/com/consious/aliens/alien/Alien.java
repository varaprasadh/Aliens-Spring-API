package com.consious.aliens.alien;

import java.time.LocalDate;
import java.util.Date;

public class Alien {
    Long id;
    String name;
    int age;
    LocalDate DOB;

    public Alien() {

    }
    public Alien(String name, LocalDate dob, int age ){
        this.id = Long.valueOf(1);
        this.name = name;
        this.DOB = dob;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", DOB=" + DOB +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }
}
