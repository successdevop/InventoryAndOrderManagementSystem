package com.SIOM.models;

import java.util.Objects;


public class Supplier extends Contact{
    private String companyName;
    private double rating;

    public Supplier(String id, String name, String email, String phoneNo, String address, String companyName, double rating){
        super(id, name, email, phoneNo, address);
        this.companyName = companyName;
        this.rating = rating;
    }

    public Supplier(Supplier source) {
        super(source);
        this.companyName = source.companyName;
        this.rating = source.rating;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Supplier supplier = (Supplier) o;
        return Double.compare(rating, supplier.rating) == 0 && Objects.equals(companyName, supplier.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), companyName, rating);
    }

    @Override
    public String toString() {
        return "Supplier{" + contactInformation() + '\''+
                "companyName='" + companyName + '\'' +
                ", rating=" + rating +
                '}';
    }
}