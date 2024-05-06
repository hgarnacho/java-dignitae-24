package com.dignitae.hibernate03_onetoone.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class AccountEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="login")
    @NotBlank
    private String login;

    @Column(name="password")
    @NotBlank
    private String password;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "AccountEntity [id=" + id + ", login=" + login + ", password=" + password + ", user=" + user + "]";
    }

    
}
