package com.ash.My_Travels.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tour_Package")
public class TourPackage {
@Id
@Column(name="Id")
@GeneratedValue
private long id;

@Column(name="Name")
private String name;

@Column(name = "Place" )
private String place;

@Column(name = "No_Of_Days")
private Integer noOfDays;

@Column(name="Cost")
private double cost;

public TourPackage(long id, String name, String place, Integer noOfDays, double cost) {
	super();
	this.id = id;
	this.name = name;
	this.place = place;
	this.noOfDays = noOfDays;
	this.cost = cost;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}

public Integer getNoOfDays() {
	return noOfDays;
}

public void setNoOfDays(Integer noOfDays) {
	this.noOfDays = noOfDays;
}

public double getCost() {
	return cost;
}

public void setCost(double cost) {
	this.cost = cost;
}



}
