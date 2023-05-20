package com.user.rest.model;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name="user_info")
public class UserDetails {
    //@Id
    private long Id;
    private String FirstName;
    private String LastName;
    private int Age;
    private String Occupation;

    public UserDetails() {
    }

    public UserDetails(long id, String firstName, String lastName, int age, String occupation) {
        this.Id = id;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Age = age;
        this.Occupation = occupation;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }
}
