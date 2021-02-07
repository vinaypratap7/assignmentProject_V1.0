package com.project.spring.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "counttab")
public class Count {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	   
	
	

}
