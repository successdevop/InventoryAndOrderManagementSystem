package com.sioms.models.identity;

import com.sioms.enums.EmployeeRole;
import com.sioms.models.baseModels.TimestampData;
import com.sioms.models.baseModels.User;

import java.time.LocalDateTime;


public final class Employee extends User {
    private String firstName;
    private String lastName;
    private EmployeeRole employeeRole;
    private String passwordHash;
    private LocalDateTime lastLoginAt;

    Employee(String id, String email, String phoneNumber, boolean isActive, String address, TimestampData timestampData,
             String firstName, String lastName, EmployeeRole employeeRole, String passwordHash, LocalDateTime lastLoginAt) {
        super(id, email, phoneNumber, isActive, address, timestampData);
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeRole = employeeRole;
        this.passwordHash = passwordHash;
        this.lastLoginAt = lastLoginAt;
    }

    Employee(Employee source) {
        super(source);
        this.firstName = source.firstName;
        this.lastName = source.lastName;
        this.employeeRole = source.employeeRole;
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

    public EmployeeRole getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(EmployeeRole employeeRole) {
        this.employeeRole = employeeRole;
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
    public String toString() {
        return "Employee{" + super.toString() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeRole=" + employeeRole +
                ", passwordHash='" + passwordHash + '\'' +
                ", lastLoginAt=" + lastLoginAt +
                '}';
    }
}