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
	ArrayList <Cat> cats = new ArrayList<>();
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
					Cat cat = new Cat(name, age, color, size, gender);
					cats.add(cat);
					System.out.println(cat);
				}
			} catch (Exception e) {
				System.err.println(e);
			}
		}

	@Override
	public ArrayList<Dog> getDogs() {
		// TODO Auto-generated method stub
		return null;
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
		Cat cat = null;
		for (Cat c: cats) {
			if (c.getName().equals(rc)) {
				cat = c;
			}
		}
		cats.remove(cat);
		return cats;
	}

	@Override
	public ArrayList<Cat> addCatNotes(String addCN) {
//		cats.add(addCN);
		for (Cat c: cats) {
			
		}
		return cats;
		
	}

	@Override
	public void updateCatNotes(String updCN) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCatByAge(String ca) {
		
		
	}

	@Override
	public void getCatByGender(String cg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCatsBySize(String csz) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDogToShelter(Dog dog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDogFromShelter(String remD) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDogNotes(String addDN) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDogNotes(String updDN) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDogByAge(String da) {
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
}
