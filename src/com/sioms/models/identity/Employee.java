package com.sioms.models.identity;

import com.sioms.enums.EmployeeRole;
import com.sioms.interfaces.model.HasTimestamp;
import com.sioms.models.baseModels.TimestampData;
import com.sioms.models.baseModels.User;

import java.time.LocalDateTime;
import java.util.Objects;


public final class Employee extends User implements HasTimestamp {
    private String firstName;
    private String lastName;
    private EmployeeRole employeeRole;
    private String passwordHash;
    private LocalDateTime lastLoginAt;
    private final TimestampData timestamp;

    public Employee(String id, String email, String phoneNumber, boolean isActive, String address, String firstName,
                    String lastName, EmployeeRole employeeRole, String passwordHash, LocalDateTime lastLoginAt, TimestampData timestamp) {
        super(id, email, phoneNumber, isActive, address);
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeRole = employeeRole;
        this.passwordHash = passwordHash;
        this.lastLoginAt = lastLoginAt;
        this.timestamp = timestamp;
    }

    public Employee(Employee source) {
        super(source);
        this.firstName = source.firstName;
        this.lastName = source.lastName;
        this.employeeRole = source.employeeRole;
        this.passwordHash = source.passwordHash;
        this.lastLoginAt = source.lastLoginAt;
        this.timestamp = source.timestamp;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
    public TimestampData getTimestampData() {
        return timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && employeeRole == employee.employeeRole && Objects.equals(lastLoginAt, employee.lastLoginAt) && Objects.equals(timestamp, employee.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, lastName, employeeRole, lastLoginAt, timestamp);
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeRole=" + employeeRole +
                ", lastLoginAt=" + lastLoginAt +
                ", timestamp=" + timestamp +
                '}';
    }
}