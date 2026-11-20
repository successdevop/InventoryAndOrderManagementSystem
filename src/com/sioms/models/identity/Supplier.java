package com.sioms.models.identity;

import com.sioms.models.baseModels.TimestampData;
import com.sioms.models.baseModels.User;

import java.util.Objects;


public class Supplier extends User {
    private String name;
    private String taxId;
    private double rating;
    private String paymentTerms;
    private String notes;
    private final TimestampData timestamp;

    public Supplier(String id, String email, String phoneNumber, boolean isActive, String address, TimestampData timestamp, String name, String taxId, double rating, String paymentTerms, String notes) {
        super(id, email, phoneNumber, isActive, address);
        this.timestamp = timestamp;
        this.name = name;
        this.taxId = taxId;
        this.rating = rating;
        this.paymentTerms = paymentTerms;
        this.notes = notes;
    }

    public Supplier(Supplier source) {
        super(source);
        this.timestamp = source.timestamp;
        this.name = source.name;
        this.taxId = source.taxId;
        this.rating = source.rating;
        this.paymentTerms = source.paymentTerms;
        this.notes = source.notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public TimestampData getTimestamp() {
        return timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Supplier supplier = (Supplier) o;
        return Double.compare(rating, supplier.rating) == 0 && Objects.equals(name, supplier.name) && Objects.equals(taxId, supplier.taxId) && Objects.equals(paymentTerms, supplier.paymentTerms) && Objects.equals(notes, supplier.notes) && Objects.equals(timestamp, supplier.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, taxId, rating, paymentTerms, notes, timestamp);
    }

    @Override
    public String toString() {
        return "Supplier{" + super.toString() + '\'' +
                "name='" + name + '\'' +
                ", taxId='" + taxId + '\'' +
                ", rating=" + rating +
                ", paymentTerms='" + paymentTerms + '\'' +
                ", notes='" + notes + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}