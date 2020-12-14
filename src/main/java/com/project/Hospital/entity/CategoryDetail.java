package com.project.Hospital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class CategoryDetail {
	@Id
	@Column
private int id;
private String name;
private String contact;
private String address;
private String post;

@OneToOne
private CategoryType categoryType;



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
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}
public CategoryType getCategoryType() {
	return categoryType;
}
public void setCategoryType(CategoryType categoryType) {
	this.categoryType = categoryType;
}


}
