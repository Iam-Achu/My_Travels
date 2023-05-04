package com.ash.My_Travels.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tour_Packages")
public class TourPackages {
@Id
@Column(name="ID")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;

@Column(name="NAME")
private String name;

@Column(name = "PLACE" )
private String place;

@Column(name = "NO_OF_DAYS")
private Integer noOfDays;

@Column(name="COST")
private double cost;

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
