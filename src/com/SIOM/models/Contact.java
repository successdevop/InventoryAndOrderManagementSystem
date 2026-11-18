package com.SIOM.models;

import java.util.Objects;

public abstract class Contact{
    protected String id;
    protected String name;
    protected String email;
    protected String phoneNo;
    protected String address;

    protected Contact(String id, String name, String email, String phoneNo, String address){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    protected Contact(Contact source){
        this.id = source.id;
        this.name = source.name;
        this.email = source.email;
        this.phoneNo = source.phoneNo;
        this.address = source.address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(id, contact.id) && Objects.equals(name, contact.name) && Objects.equals(email, contact.email) && Objects.equals(phoneNo, contact.phoneNo) && Objects.equals(address, contact.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phoneNo, address);
    }

    protected String contactInformation() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'';
    }
}