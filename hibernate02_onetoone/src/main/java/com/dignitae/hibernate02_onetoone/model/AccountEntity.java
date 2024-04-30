package com.dignitae.hibernate02_onetoone.model;

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
@Table(name="account")
public class AccountEntity {

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

    public AccountEntity(@NotBlank String login, @NotBlank String password) {
        this.login = login;
        this.password = password;
        this.user = null;
    }
    
    public AccountEntity(@NotBlank String login, @NotBlank String password, UserEntity user) {
        this.login = login;
        this.password = password;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "AccountEntity [id=" + id + ", login=" + login + ", password=" + password + ", user=" + user + "]";
    }

}
