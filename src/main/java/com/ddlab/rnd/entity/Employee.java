package com.ddlab.rnd.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "Employee")
@Table(name = "Employee")
@Getter
@Setter
@ToString
@NoArgsConstructor
@NamedQuery(name = "Employee.query1", query = "SELECT e FROM Employee e ")
@NamedQuery(name = "Employee.query2", query = "SELECT e FROM Employee e order by e.city desc")
@NamedQuery(name = "User.findByName", query = "SELECT e FROM Employee e WHERE e.name = :name")
public class Employee {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "city")
	private String city;

	@Column(name = "project")
	private String project;

	@Column(name = "salary")
	private int salary;

	@Column(name = "age")
	private int age;

	public Employee(String name, String city, String project, int salary, int age) {
		super();
		this.name = name;
		this.city = city;
		this.project = project;
		this.salary = salary;
		this.age = age;
	}

}
