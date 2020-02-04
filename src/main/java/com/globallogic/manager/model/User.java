package com.globallogic.manager.model;

import javax.validation.constraints.Pattern;
import java.util.List;

public class User {
    private String name;

    @Pattern(regexp = ".+@.+\\..+", message = "Format email is invalid, should be similar to aaaaaaa@dominio.cl")
    private String email;


    @Pattern(regexp = "((?=.*[a-z])(?=.*d)(?=.*[A-Z]).{6,10})", message = "Password inserted does not compliment " +
            " with the standard rules")
    private String password;

    private List<Phone> phones;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phones=" + phones +
                '}';
    }
}
