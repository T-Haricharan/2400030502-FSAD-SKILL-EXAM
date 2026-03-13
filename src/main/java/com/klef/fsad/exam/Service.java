package com.klef.fsad.exam;

import jakarta.persistence.*;

@Entity
@Table(name="service")
public class Service 
{
	@Id
	int id;
	String name;
	String date;
	String status;

	public Service(){}

	public Service(int id,String name,String date,String status)
	{
		this.id=id;
		this.name=name;
		this.date=date;
		this.status=status;
	}

	public int getId(){return id;}
	public void setId(int id){this.id=id;}

	public String getName(){return name;}
	public void setName(String name){this.name=name;}

	public String getDate(){return date;}
	public void setDate(String date){this.date=date;}

	public String getStatus(){return status;}
	public void setStatus(String status){this.status=status;}
}