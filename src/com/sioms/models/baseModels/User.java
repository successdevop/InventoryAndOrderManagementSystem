package com.sioms.models.baseModels;

import java.util.Objects;


public abstract class User {
    private final String id;
    private String email;
    private String phoneNumber;
    private boolean isActive;
    private String address;

    protected User(String id, String email, String phoneNumber, boolean isActive, String address){
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
        this.address = address;
    }

    protected User(User source){
        this.id = source.id;
        this.email = source.email;
        this.phoneNumber = source.phoneNumber;
        this.isActive = source.isActive;
        this.address = source.address;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isActive == user.isActive && Objects.equals(id, user.id) && Objects.equals(email, user.email) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, phoneNumber, isActive, address);
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isActive=" + isActive +
                ", address='" + address + '\'';
    }
}