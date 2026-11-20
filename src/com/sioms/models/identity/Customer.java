package com.sioms.models.identity;

import com.sioms.enums.CustomerType;
import com.sioms.models.baseModels.BusinessEntity;
import com.sioms.models.baseModels.TimestampData;
import com.sioms.models.baseModels.User;

import java.math.BigDecimal;


public final class Customer extends User {
    private CustomerType customerType;
    private BigDecimal totalPurchase;
    private final BusinessEntity businessEntity;


    Customer(String id, String email, String phoneNumber, boolean isActive, String address, TimestampData timestampData, CustomerType customerType, BigDecimal totalPurchase, BusinessEntity businessEntity) {
        super(id, email, phoneNumber, isActive, address, timestampData);
        this.customerType = customerType;
        this.totalPurchase = totalPurchase;
        this.businessEntity = businessEntity;
    }

    Customer(Customer source) {
        super(source);
        this.customerType = source.customerType;
        this.totalPurchase = source.totalPurchase;
        this.businessEntity = source.businessEntity;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public BigDecimal getTotalPurchase() {
        return totalPurchase;
    }

    public void setTotalPurchase(BigDecimal totalPurchase) {
        this.totalPurchase = totalPurchase;
    }

    public BusinessEntity getBusinessEntity() {
        return businessEntity;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                ", customerType=" + customerType +
                ", totalPurchase=" + totalPurchase +
                ", businessEntity=" + businessEntity +
                '}';
    }
}