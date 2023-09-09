package com.example.estars;
//define database

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Estars {
    @Id //identified primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String studentName;

    public Estars() {

    }
    public Estars(long id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getid() {
        return id;
    }

    public void setid(long id) {
        this.id = id;
    }






}
