package com.skill.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id;
    private String name;
    private String gender;

    @Autowired
    private Certification certification;

    public Student() {
        this.id = 1;
        this.name = "Dedeepya";
        this.gender = "Female";
    }

    public void displayDetails() {
        System.out.println("Student Id: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Certification Id: " + certification.getId());
        System.out.println("Certification Name: " + certification.getName());
        System.out.println("Date of Completion: " + certification.getDateOfCompletion());
    }
}
