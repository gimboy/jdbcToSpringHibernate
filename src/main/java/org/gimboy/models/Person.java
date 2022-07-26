package org.gimboy.models;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Person {
    private int id;
    @NotEmpty(message = "name ne null")
    @Size(min = 3,max = 12,message = "3...12 only")
    private String name;
    @NotEmpty(message = "not empty")
    @Size(min = 6,max = 38,message = "6...18 sorry bro")
    private String email;
    @Min(value = 14,message = "passport only 14")
    @Max(value = 104,message = "lol you record ginius ???")
    private int age;

    public Person(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Person() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
