//Program to define DeliveryPerson Entity
package com.tns.fooddeliverysystem.entities;

public class DeliveryPerson {
 private int deliveryPersonId;
 private String name;
 private long contactNo;

 public DeliveryPerson(int deliveryPersonId, String name, long contactNo) {
     this.deliveryPersonId = deliveryPersonId;
     this.name = name;
     this.contactNo = contactNo;
 }

 public int getDeliveryPersonId() {
     return deliveryPersonId;
 }

 public String getName() {
     return name;
 }

 public long getContactNo() {
     return contactNo;
 }
}
