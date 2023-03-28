package com.govt.dtdc.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DtdcEntity {

    @Id
    @GeneratedValue
    private long dtdcId;
    private String senderAddress;
    private String receiverAddress;
    private double amount;
    private double kilometers;
    private long phoneNumber;

    public long getDtdcId() {
        return dtdcId;
    }

    public void setDtdcId(long dtdcId) {
        this.dtdcId = dtdcId;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public DtdcEntity(long dtdcId, String senderAddress, String receiverAddress, double amount, double kilometers, long phoneNumber) {
        this.dtdcId = dtdcId;
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
        this.amount = amount;
        this.kilometers = kilometers;
        this.phoneNumber = phoneNumber;
    }

    public DtdcEntity() {
    }

    @Override
    public String toString() {
        return "DtdcEntity{" +
                "dtdcId=" + dtdcId +
                ", senderAddress='" + senderAddress + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", amount=" + amount +
                ", kilometers=" + kilometers +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}




