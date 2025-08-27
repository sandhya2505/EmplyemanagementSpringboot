package com.klef.fsad.spd.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="manager_table")
public class Manager {

	@Id
	@Column(name="manager_id")
    private Long id;
	@Column(name="manager_username",nullable=false,unique=true)
	private String name;
	@Column(name="manager_email",nullable=false,unique=true)
    private String email;	
	@Column(name="manager_password",nullable=false)
   private String password;
	@Column(name="manager_dept",nullable=false)
   private String department;
	@Column(name="manager_contact",nullable=false,unique=true)
	private String contact;
	
	@OneToMany(mappedBy="manager", cascade=CascadeType.ALL)
	private List<Employee> employees;
	@OneToMany(mappedBy="assignedByManager",cascade=CascadeType.ALL)
	private List<Duty>dutiesAssigned;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Duty> getDutiesAssigned() {
		return dutiesAssigned;
	}

	public void setDutiesAssigned(List<Duty> dutiesAssigned) {
		this.dutiesAssigned = dutiesAssigned;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", department="
				+ department + ", contact=" + contact + ", employees=" + employees + ", dutiesAssigned="
				+ dutiesAssigned + "]";
	}
	
	
	
	
	
}
