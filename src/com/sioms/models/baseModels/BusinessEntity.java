package com.sioms.models.baseModels;

public class BusinessEntity{
    private String name;
    private String taxId;
    private String notes;

    public BusinessEntity(String name, String taxId, String notes) {
        this.name = name;
        this.taxId = taxId;
        this.notes = notes;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "BusinessEntity{" +
                "name='" + name + '\'' +
                ", taxId='" + taxId + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}