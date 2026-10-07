package com.sccgms.entity;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(nullable = false, unique = true, length = 100)
    private String email;
    @Column(nullable = false, length = 255)
    private String password;
    @Column(length = 15)
    private String phone;
    @Column(nullable = false, length = 20)
    private String role;
    private LocalDateTime created_at;
    public User() {
    }  
    public Integer getUser_id() {
    return user_id;
}
public void setUser_id(Integer user_id) {
    this.user_id = user_id;
}
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
    return password;}
public void setPassword(String password) {
    this.password = password;
}
public String getPhone() {
    return phone;
}
public void setPhone(String phone) {
    this.phone = phone;
}
public String getRole() {
    return role;}
public void setRole(String role) {
    this.role = role;
}
public LocalDateTime getCreated_at() {
    return created_at;
}
public void setCreated_at(LocalDateTime created_at) {
    this.created_at = created_at;
}
}