package ru.adamov.springcourse.models;


import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
    public Person(){}
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





    public Person( int id, String name,  int age, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.age = age;
    }
   @Min(value=0, message = "age should be greater than zero")
    private int age;

    @NotEmpty(message = "Name should not be  empty")
    @Size(min=2, max=30, message = "Name should be between 2 and 30 characters")
    private String name;

    @NotEmpty(message = "not empty!")
    @Email(message = "not EMAIL format!")
       private String email;

    private int id;

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
