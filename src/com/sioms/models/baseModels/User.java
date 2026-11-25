package com.sioms.models.baseModels;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;


public abstract class User implements Serializable {
    private UUID id;
    private String email;
    private String phoneNumber;
    private boolean isActive;
    private String address;
    private TimestampData timestampData;

    protected User(){}

    protected User(UUID id, String email, String phoneNumber, boolean isActive, String address,
                   TimestampData timestampData){
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
        this.address = address;
        this.timestampData = timestampData;
    }

    protected User(User source){
        this.id = source.id;
        this.email = source.email;
        this.phoneNumber = source.phoneNumber;
        this.isActive = source.isActive;
        this.address = source.address;
        this.timestampData = source.timestampData;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public TimestampData getTimestampData() {
        return timestampData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isActive=" + isActive +
                ", address='" + address + '\'' +
                ", timestampData=" + timestampData +
                '}';
    }
}