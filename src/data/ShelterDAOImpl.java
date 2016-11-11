package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

import entities.Cat;
import entities.Dog;

public class ShelterDAOImpl implements ShelterDAO {
	private static final String FILE_NAME = "/WEB-INF/cats.csv";
	private static final String FILE_NAME2 = "/WEB-INF/dogs.csv";
	ArrayList <Cat> cats = new ArrayList<>();
	ArrayList <Dog> dogs = new ArrayList<>();
//	public ArrayList<Cat> getCats(){
//		return cats;
		
		public ShelterDAOImpl(){
			System.out.println("LOADED");
		}
		@Autowired
		private WebApplicationContext wac;
		
		@PostConstruct
		public void init() {
			System.out.println("test");
			try (InputStream is = wac.getServletContext().getResourceAsStream(FILE_NAME);
					
					BufferedReader buf = new BufferedReader(new InputStreamReader(is));) {
				String line = buf.readLine();
				while ((line = buf.readLine()) != null) {
					String[] tokens = line.split(",");
					String name = tokens[0];
					String age = tokens[1];
					String color = tokens[2];
					String size = tokens[3];
					String gender = tokens[4];
					String note = tokens[5];
					Cat cat = new Cat(name, age, color, size, gender, note);
					cats.add(cat);
					System.out.println(cat);
				}
			} catch (Exception e) {
				System.err.println(e);
			}
			
			try (InputStream is = wac.getServletContext().getResourceAsStream(FILE_NAME2);
					
					BufferedReader buf = new BufferedReader(new InputStreamReader(is));) {
				String line = buf.readLine();
				while ((line = buf.readLine()) != null) {
					String[] tokens = line.split(",");
					String name = tokens[0];
					String age = tokens[1];
					String breed = tokens[2];
					String gender = tokens[3];
					Dog dog = new Dog(name, age, breed, gender);
					dogs.add(dog);
					System.out.println(dog);
				}
			} catch (Exception e) {
				System.err.println(e);
			}
		}


	@Override
	public ArrayList<Cat> addCatToShelter(Cat cat) {
		cats.add(cat);
		for (Cat c : cats) {
			System.out.println(c);
		}
		return cats;
		
	}

	@Override
	public ArrayList<Cat> removeCatFromShelter(String rc) {
		Cat cat = new Cat();
		for (Cat c: cats) {
			if (c.getName().equals(rc)) {
				cat = c;
			}
		}
		cats.remove(cat);
		return cats;
	}

	@Override
	public ArrayList<Cat> addCatNotes(String addCN, String catName) {
		Cat cat = new Cat();
		for (Cat c: cats) {
			if (c.getName().equals(catName)) {
				cat = c;
			}
		}
		cat.setNote();
		return cats;
		
	}

	//@Override
//	public void updateCatNotes(String updCN, String addCN) {
//		Cat cat = new Cat();
//		if (addCN != updCN) {
//			updCN = addCN;
//		}
//		System.out.println(addCN);
//	}

	@Override
	public void getCatByGender(String cg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCatsBySize(String csz) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList <Dog> addDogToShelter(Dog dog) {
		dogs.add(dog);
		for (Dog d : dogs) {
			System.out.println(d);
		}
		return dogs;
	}

	@Override
	public ArrayList <Dog> removeDogFromShelter(String remD) {
		Dog dog = new Dog();
		for (Dog d: dogs) {
			if (d.getName().equals(remD)) {
				dog = d;
			}
		}
		dogs.remove(dog);
		return dogs;
	}

	@Override
	public void addDogNotes(String addDN, String dogName) {
		Dog dog = new Dog();
		for (Dog d: dogs) {
			if (d.getName().equals(dogName)) {
				dog = d;
			}
		}
		dog.add(addDN);
		
	}

	@Override
	public void updateDogNotes(String updDN) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDogByGender(String dg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBySize(String dsz) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Cat> getCats() {
		return cats;
	}
	@Override
	public ArrayList<Dog> getDogs() {
		return dogs;
	}


	@Override
	public ArrayList<Dog> getAllDogs() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ArrayList<Cat> getAllCats() {
		// TODO Auto-generated method stub
		return cats;
	}


	@Override
	public String updateCatNotes(String updCN, String addCN) {
		// TODO Auto-generated method stub
		return null;
	}
}
