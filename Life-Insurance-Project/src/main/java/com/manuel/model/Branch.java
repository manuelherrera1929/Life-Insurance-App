package com.manuel.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Branch {
	
		@Id @GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="branch_id")
		private int branch_id;
		
		private String branch_name;
		private String address;
		private String phone;
		private String location;
		private String date;
		private String city;
		private String state;
		
		@OneToMany(cascade=CascadeType.ALL, targetEntity=BranchManager.class)
		@JoinColumn(name="manager_id")
		private Set<BranchManager> BranchManager = new HashSet<>();
		
		@OneToMany(cascade=CascadeType.ALL, targetEntity=Customer.class)
		@JoinColumn(name="cust_id")
		private Set<Customer> Customer = new HashSet<>();
		
		public Branch(int branch_id, String branch_name, String address, String phone, String location, String date,
				String city, String state) {
			super();
			this.branch_id = branch_id;
			this.branch_name = branch_name;
			this.address = address;
			this.phone = phone;
			this.location = location;
			this.date = date;
			this.city = city;
			this.state = state;
		}

		public int getBranch_id() {
			return branch_id;
		}

		public void setBranch_id(int branch_id) {
			this.branch_id = branch_id;
		}

		public String getBranch_name() {
			return branch_name;
		}

		public void setBranch_name(String branch_name) {
			this.branch_name = branch_name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

	}
