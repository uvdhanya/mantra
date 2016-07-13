package com.litmus7.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Dhanya
 *
 */
@Entity
@Table(name="user")
public class User {
 
    @Id
    @Column(name="userId")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userId;
    
    private String name;
    private int age;
    private String gender;
    private String email;
 
   
     
    public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
    public String toString(){
        return "userId="+userId+", name="+name+", age="+age+", gender="+gender+", email="+email;
    }
}