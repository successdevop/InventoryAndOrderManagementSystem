package com.sioms.models.identity;

import com.sioms.enums.CustomerType;
import com.sioms.interfaces.model.HasTimestamp;
import com.sioms.models.baseModels.TimestampData;
import com.sioms.models.baseModels.User;

import java.math.BigDecimal;
import java.util.Objects;


public class Customer extends User implements HasTimestamp {
    private String name;
    private CustomerType customerType;
    private String taxId;
    private BigDecimal totalPurchase;
    private String notes;
    private final TimestampData timestamp;

    public Customer(String id, String email, String phoneNumber, boolean isActive, String address, String name,
                       CustomerType customerType, String taxId, BigDecimal totalPurchase, String notes, TimestampData timestamp) {
        super(id, email, phoneNumber, isActive, address);
        this.name = name;
        this.customerType = customerType;
        this.taxId = taxId;
        this.totalPurchase = totalPurchase;
        this.notes = notes;
        this.timestamp = timestamp;
    }

    public Customer(Customer source) {
        super(source);
        this.name = source.name;
        this.customerType = source.customerType;
        this.taxId = source.taxId;
        this.totalPurchase = source.totalPurchase;
        this.notes = source.notes;
        this.timestamp = source.timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public BigDecimal getTotalPurchase() {
        return totalPurchase;
    }

    public void setTotalPurchase(BigDecimal totalPurchase) {
        this.totalPurchase = totalPurchase;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public TimestampData getTimestampData() {
        return timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && customerType == customer.customerType && Objects.equals(taxId, customer.taxId) && Objects.equals(totalPurchase, customer.totalPurchase) && Objects.equals(notes, customer.notes) && Objects.equals(timestamp, customer.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, customerType, taxId, totalPurchase, notes, timestamp);
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() + '\'' +
                "name='" + name + '\'' +
                ", customerType=" + customerType +
                ", taxId='" + taxId + '\'' +
                ", totalPurchase=" + totalPurchase +
                ", notes='" + notes + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}