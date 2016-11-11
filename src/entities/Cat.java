package entities;

import java.util.ArrayList;

public class Cat {
	private String name;
	private String age;
	private String color;
	private String size;
	private String gender;
	private ArrayList<String> notes;
	
	public Cat(){
		
	}
	
	public Cat(String name, String age, String color, String size, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.size = size;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public String getGender(){
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}


	public ArrayList<String> getNotes() {
		return notes;
	}


	public void setNotes(ArrayList<String> notes) {
		this.notes = notes;
	}
	
	public void add(String note){
		notes.add(note);
	}
	
}
