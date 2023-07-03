package com.taashee.training.HibernateTraining.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class IndianCitizen {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="citizen_id")
   private int id;
   private String name;
   @OneToOne
   @JoinColumn(name="aadhar_card_id",unique=true)
   private AadharCard aadhar;
public AadharCard getAadhar() {
	return aadhar;
}
public void setAadhar(AadharCard aadhar) {
	this.aadhar = aadhar;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
