package com.taashee.training.HibernateTraining.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.UniqueConstraint;

@Entity
public class AadharCard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="aadhar_card_id")
	private int id;
	@Column(unique=true)
   private String aadharNo;
   @OneToOne(mappedBy="aadhar")
   private IndianCitizen citizen;
   public int getId() {
	  return id;
   }
public void setId(int id) {
	this.id = id;
}
public String getAadharNo() {
	return aadharNo;
}
public void setAadharNo(String aadharNo) {
	this.aadharNo = aadharNo;
}

}
