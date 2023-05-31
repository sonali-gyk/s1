package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String gender;
	
	private String address;
	
	private long number;
	
	private long acnumber;
	
	private String profession;
	
	private String citizenship;
	
	private long balance;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public long getAcnumber() {
		return acnumber;
	}

	public void setAcnumber(long acnumber) {
		this.acnumber = acnumber;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	

	public User(int id, String name, String gender, String address, long number, long acnumber, String profession,
			String citizenship, long balance) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.number = number;
		this.acnumber = acnumber;
		this.profession = profession;
		this.citizenship = citizenship;
		this.balance = balance;
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


	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", number="
				+ number + ", acnumber=" + acnumber + ", profession=" + profession + ", citizenship=" + citizenship
				+ ", balance=" + balance + "]";
	}

	public User()
	{
		
	}
}
