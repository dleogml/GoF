package org.example.section2.adapter.implement;

import org.example.section2.adapter.implement.security.UserDetails;

public class Account implements UserDetails {
    private String name;

    private  String password;

    private String email;

    @Override
    public String getUsername() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
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
}
