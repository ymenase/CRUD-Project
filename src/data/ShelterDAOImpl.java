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
	ArrayList<Cat> cats = new ArrayList<>();
	ArrayList<Dog> dogs = new ArrayList<>();

	public ShelterDAOImpl() {
	}

	@Autowired
	private WebApplicationContext wac;

	@PostConstruct
	public void init() {
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
				String image = tokens[6];
				Cat cat = new Cat(name, age, color, size, gender, note, image);
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
				String note = tokens[4];
				String image = tokens[5];
				Dog dog = new Dog(name, age, breed, gender, note, image);
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
		for (Cat c : cats) {
			if (c.getName().equals(rc)) {
				cat = c;
			}
		}
		cats.remove(cat);
		return cats;
	}

	@Override
	public ArrayList<Cat> updateCatNotes(String note, String name) {
		Cat cat = new Cat();
		for (Cat c : cats) {
			if (c.getName().equals(name)) {
				cat = c;
			}
		}
		StringBuilder sb = new StringBuilder();
		String oldNote = cat.getNote();
		sb.append(oldNote);
		sb.append(" ");
		sb.append(note);
		sb.append(" ");
		cat.setNote(sb.toString());
		return cats; //return list to controller
	}
	@Override
	public ArrayList<Cat> clearCatNotes(String name) {
		Cat cat = new Cat();
		for (Cat c : cats) {
			if (c.getName().equals(name)) {
				cat = c;
			}
		}
		cat.setNote("");
		return cats; //return list to controller
	}

	@Override
	public ArrayList<Cat> getCatsByGender(String cg) {
		ArrayList<Cat> filteredCats = new ArrayList<Cat>();
		for (Cat c : cats){ //iterate over stored cats
			if (c.getGender().equals(cg)) {
				filteredCats.add(c);
			}
		}
		return filteredCats;
	}

	@Override
	public ArrayList<Cat> getCatsBySize(String csize) { //compare sort request to current cats
		ArrayList<Cat> filteredCatsS = new ArrayList<Cat>();
		for (Cat c : cats) {
			if (c.getSize().equals(csize)) {
				filteredCatsS.add(c);
			}
		}
		return filteredCatsS;
	}

	@Override
	public ArrayList<Dog> addDogToShelter(Dog dog) {
		dogs.add(dog);
		for (Dog d : dogs) {
			System.out.println(d);
		}
		return dogs;
	}

	@Override
	public ArrayList<Dog> removeDogFromShelter(String remD) {
		Dog dog = new Dog();          //iterate through array to find the dog that matches
		for (Dog d : dogs) {
			if (d.getName().equals(remD)) {
				dog = d;
			}
		}
		dogs.remove(dog);         //remove selected dog
		return dogs;
	}

	@Override
	public ArrayList<Dog> updateDogNotes(String note, String name) {
		Dog dog = new Dog();
		for (Dog d : dogs) {
			if (d.getName().equals(name)) {
				dog = d;
			}
		}
		StringBuilder sb = new StringBuilder(); // take input from new note and append 
		String oldNote = dog.getNote(); //to new note
		sb.append(oldNote);
		sb.append(" ");
		sb.append(note);
		sb.append(" ");
		dog.setNote(sb.toString());
		return dogs;
	}

	@Override
	public ArrayList<Dog> clearDogNotes(String name) {
		Dog dog = new Dog();
		for (Dog d : dogs) {
			if (d.getName().equals(name)) {
				dog = d;
			}
		}
		dog.setNote("");
		return dogs; //return list to controller
	}
	@Override
	public ArrayList<Dog> getDogsByGender(String dg) {
		ArrayList<Dog> filteredDogs = new ArrayList<Dog>();
		for (Dog d : dogs){ //iterate over stored dogs
			if (d.getGender().equals(dg)) {
				filteredDogs.add(d);
			}
		}
		return filteredDogs;

	}

	@Override
	public ArrayList<Dog> getDogByBreed(String dbb) {
		ArrayList<Dog> filteredDogsB = new ArrayList<Dog>();
		for (Dog d : dogs) {
			if (d.getBreed().equals(dbb)) {
				filteredDogsB.add(d);
			}
		}
		System.out.println(filteredDogsB);
		return filteredDogsB;
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

}
