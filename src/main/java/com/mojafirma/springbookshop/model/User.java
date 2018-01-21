package com.mojafirma.springbookshop.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;
    @Email(message = "Podaj prawidlowy adres")
    @NotNull(message = "Podaj adres email")
    private String email;
    @Length(min = 8, message = "Haslo musi miec co najmniej 8 znakow")
    @NotEmpty(message = "Podaj haslo")
    private String password;
    @NotEmpty(message = "Podaj imie")
    private String name;
    @NotEmpty(message = "Podaj nazwisko")
    private String lastname;
    private int active;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Roles> roleSet;

    public User(String email, String password, String name, String lastname, int active, Set<Roles> roleSet) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.active = active;
        this.roleSet = roleSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Set<Roles> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Roles> roleSet) {
        this.roleSet = roleSet;
    }
}
