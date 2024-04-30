package com.dignitae.hibernate02_onetoone.model;

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
@Table(name="user")
public class UserEntity implements Serializable {

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


    public UserEntity(@NotBlank String name, @NotBlank String surname) {
        this.name = name;
        this.surname = surname;
        this.account = null;
    }

    public UserEntity(@NotBlank String name, @NotBlank String surname, AccountEntity account) {
        this.name = name;
        this.surname = surname;
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "UserEntity [id=" + id + ", name=" + name + ", surname=" + surname + ", account=" + account + "]";
    }

}
