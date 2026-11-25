package com.sioms.models.identity;

import com.sioms.models.baseModels.BusinessEntity;
import com.sioms.models.baseModels.TimestampData;
import com.sioms.models.baseModels.User;

import java.io.Serializable;
import java.util.UUID;


public final class Supplier extends User implements Serializable {
    private int rating;
    private String paymentTerms;
    private final BusinessEntity businessEntity;

    Supplier(UUID id, String email, String phoneNumber, boolean isActive, String address, TimestampData timestampData,
             int rating, String paymentTerms, BusinessEntity businessEntity) {
        super(id, email, phoneNumber, isActive, address, timestampData);
        this.rating = rating;
        this.paymentTerms = paymentTerms;
        this.businessEntity = businessEntity;
    }

    Supplier(Supplier source) {
        super(source);
        this.rating = source.rating;
        this.paymentTerms = source.paymentTerms;
        this.businessEntity = source.businessEntity;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public BusinessEntity getBusinessEntity() {
        return businessEntity;
    }

    @Override
    public String toString() {
        return "Supplier{" + super.toString() +
                ", rating=" + rating +
                ", paymentTerms='" + paymentTerms + '\'' +
                ", businessEntity=" + businessEntity +
                '}';
    }
}