package entities;

public class Dog {
	private int age;
	private String name;
	private String breed;
	private String color;
	private String size;
	private String gender;
	
	public Dog(int age, String name, String breed, String color, String size, String gender) {
		super();
		this.age = age;
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.size = size;
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void getBreed(String breed) {
		this.breed = breed;
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
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}

}
