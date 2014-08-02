package com.vmsi.mypackage;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity(name="client")
@Table(name = "emp1000", catalog = "tutorials")
public class Employee {
private int id;
private String firstName,lastName;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}


}
