package com.cda2.classes;

public class Utilisateur {

    private String name;
    private String firstname;
    private String email;
    private String password;

    public Utilisateur(){

    }
    public Utilisateur(String name,String firstname,String email,String password){
        this.name = name;
        this.firstname = firstname;
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
