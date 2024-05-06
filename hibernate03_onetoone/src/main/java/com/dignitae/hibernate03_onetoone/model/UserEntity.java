package com.dignitae.hibernate03_onetoone.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @NotBlank
    private String name;
    
    @Column(name = "surname")
    @NotBlank
    private String surname;
        
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private AccountEntity account;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "UserEntity [id=" + id + ", name=" + name + ", surname=" + surname + ", account=" + account
                + "]";
    }

}
