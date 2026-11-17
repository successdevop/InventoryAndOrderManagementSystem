package com.SIOM.models;

import com.SIOM.enums.UserRole;

import java.util.Objects;

public class User{
    private String id;
    private String fullName;
    private String email;
    private String passwordHash;
    private UserRole userRole;
    private boolean isActive;

    public User(){}

    public User(String id, String fullName, String email, String passwordHash, UserRole userRole, boolean isActive){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.userRole = userRole;
        this.isActive = isActive;
    }

    public User(User source){
        this.id = source.id;
        this.fullName = source.fullName;
        this.email = source.email;
        this.passwordHash = source.passwordHash;
        this.userRole = source.userRole;
        this.isActive = source.isActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isActive == user.isActive && Objects.equals(id, user.id) && Objects.equals(fullName, user.fullName) && Objects.equals(email, user.email) && Objects.equals(userRole, user.userRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, email, userRole, isActive);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", userRole=" + userRole +
                ", isActive=" + isActive +
                '}';
    }
}