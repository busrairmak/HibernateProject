package com.hibernate;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Parent {

    @Id
    private int id;

    @Column(name ="NAME")
    private String name;

    private String surname;

    private int age;

    private transient List<Child> child;

/*this parametre elemanının sınıf elemanıyla karısmaması icin*/


    public Parent(int id, String name, String surname, int age, List<Child> child) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.child = child;
    }

    public Parent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public List<Child> getChild() {
        return child;
    }

    public void setChild(List<Child> child) {
        this.child = child;
    }



}
