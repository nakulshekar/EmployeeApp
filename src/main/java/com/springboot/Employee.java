package com.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table
public class Employee {
@Id
@Column(name="id")
private Integer id;
@Column(name="name")
private String name;
@Column(name="salary")
private double salary;
@Column(name="designation")
private String designation;
public Employee() {

}
public Employee(Integer id, String name, double salary, String designation) {
	
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.designation = designation;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
}



}
