package com.sioms.models;

import com.sioms.enums.CustomerType;

import java.util.Objects;

public class Customer extends Contact{
    private CustomerType customerType;

    public Customer(String id, String name, String email, String phoneNo, String address) {
        super(id, name, email, phoneNo, address);
    }

    public Customer(Customer source) {
        super(source);
        this.customerType = source.customerType;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerType, customer.customerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customerType);
    }

    @Override
    public String toString() {
        return "Customer{" + contactInformation() + '\''+
                "customerType=" + customerType +
                '}';
    }
}