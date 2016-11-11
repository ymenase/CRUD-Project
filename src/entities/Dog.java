package entities;

import java.util.ArrayList;

public class Dog {
	private String name;
	private String age;
	private String breed;
	private String gender;
	private ArrayList<String> notes = new ArrayList<>();
	
	public Dog(String name, String age, String breed, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.gender = gender;
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
