package com.sioms.models.identity;

import com.sioms.models.baseModels.User;

import java.time.LocalDateTime;
import java.util.Objects;


public final class Employee extends User{
    private String firstName;
    private String lastName;
    private String passwordHash;
    private LocalDateTime lastLoginAt;

    public Employee(String id, String email, String phoneNumber, boolean isActive, String address,
                    String firstName, String lastName, String passwordHash, LocalDateTime lastLoginAt) {
        super(id, email, phoneNumber, isActive, address);
        this.firstName = firstName;
        this.lastName = lastName;
        this.passwordHash = passwordHash;
        this.lastLoginAt = lastLoginAt;
    }

    public Employee(Employee source) {
        super(source);
        this.firstName = source.firstName;
        this.lastName = source.lastName;
        this.passwordHash = source.passwordHash;
        this.lastLoginAt = source.lastLoginAt;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public LocalDateTime getLastLoginAt() {
        return lastLoginAt;
    }

    public void setLastLoginAt(LocalDateTime lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(lastLoginAt, employee.lastLoginAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, lastName, lastLoginAt);
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lastLoginAt=" + lastLoginAt +
                '}';
    }
}