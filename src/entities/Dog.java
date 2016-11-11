package entities;

import java.util.ArrayList;

public class Dog {
	private String name;
	private String age;
	private String breed;
	private String gender;
	private String note;
	
	public Dog(String name, String age, String breed, String gender, String note) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.gender = gender;
		this.note = note;
	}

	public Dog() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	

	public String getNote(){
		return note;
	}
	
	public void setNote(String note){
		this.note = note;
	}
}
