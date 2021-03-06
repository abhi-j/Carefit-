package com.example.CareFitMain.model;

import java.io.Serializable;

public final class User implements Serializable {
    private String uname;
    private String email;
    private String passwd;
    private String cpasswd;
    private String contact;

    public User() {
    }

    public User(String email, String passwd) {
        this.email = email;
        this.passwd = passwd;
    }

    public User(String uname, String email, String passwd,String cpasswd,  String contact) {
        this.uname = uname;
        this.email = email;
        this.passwd = passwd;
        this.cpasswd = cpasswd;
        this.contact = contact;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() { return passwd; }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getCpasswd() { return cpasswd; }

    public void setCpasswd(String cpasswd) {
        this.cpasswd = cpasswd;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
