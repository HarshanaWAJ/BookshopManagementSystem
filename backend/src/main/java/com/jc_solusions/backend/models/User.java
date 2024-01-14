package com.jc_solusions.backend.models;


import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;
    @Column(unique = true)
    private String user_name;
    @Column(unique = true)
    private String email_id;
    private String user_password;

    //No Arg Constructor
    public User() {
    }

    //All Arg Constructor
    public User(int id, String first_name, String last_name, String user_name, String email_id, String user_password) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_name = user_name;
        this.email_id = email_id;
        this.user_password = user_password;
    }

    //Getters
    public long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public String getUser_password() {
        return user_password;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

}
