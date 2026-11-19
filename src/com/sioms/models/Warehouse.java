package com.sioms.models;

import java.time.LocalDate;
import java.util.Objects;

public class Warehouse{
    private String id;
    private String warehouseName;
    private String location;
    private String address;
    private String managerId;
    private LocalDate dateCreated;
    private boolean status;

    public Warehouse(String id, String warehouseName, String location, String address, String managerId, LocalDate dateCreated, boolean status) {
        this.id = id;
        this.warehouseName = warehouseName;
        this.location = location;
        this.address = address;
        this.managerId = managerId;
        this.dateCreated = dateCreated;
        this.status = status;
    }

    public Warehouse(Warehouse source) {
        this.id = source.id;
        this.warehouseName = source.warehouseName;
        this.location = source.location;
        this.address = source.address;
        this.managerId = source.managerId;
        this.dateCreated = source.dateCreated;
        this.status = source.status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Warehouse warehouse = (Warehouse) o;
        return status == warehouse.status && Objects.equals(id, warehouse.id) && Objects.equals(warehouseName, warehouse.warehouseName) && Objects.equals(location, warehouse.location) && Objects.equals(address, warehouse.address) && Objects.equals(managerId, warehouse.managerId) && Objects.equals(dateCreated, warehouse.dateCreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, warehouseName, location, address, managerId, dateCreated, status);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id='" + id + '\'' +
                ", warehouseName='" + warehouseName + '\'' +
                ", location='" + location + '\'' +
                ", address='" + address + '\'' +
                ", managerId='" + managerId + '\'' +
                ", dateCreated=" + dateCreated +
                ", status=" + status +
                '}';
    }
}