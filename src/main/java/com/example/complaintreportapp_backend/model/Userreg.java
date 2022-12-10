package com.example.complaintreportapp_backend.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userreg")
public class Userreg {

    @Id
    @GeneratedValue

    public int id;
    public String name;
    public String address;
    public String phoneno;
    public String emailid;
    public String username;
    public String password;

    public Userreg() {
    }

    public Userreg(int id, String name, String address, String phoneno, String emailid, String username, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;
        this.emailid = emailid;
        this.username = username;
        this.password = password;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


