package data;

import java.util.ArrayList;

import entities.Cat;
import entities.Dog;

public interface ShelterDAO {
	public ArrayList<Cat> getCats();
	public ArrayList<Dog> getDogs();
	public void addCatToShelter(Cat cat);
	public void removeCatFromShelter(String rc);
	public void addCatNotes(String addCN);
	public void updateCatNotes (String updCN);
	public void getCatByAge(String ca);
	public void getCatByGender(String cg);
	public void getCatsBySize(String csz);
	public void addDogToShelter(Dog dog);
	public void removeDogFromShelter(String remD);
	public void addDogNotes(String addDN);
	public void updateDogNotes (String updDN);
	public void getDogByAge(String da);
	public void getDogByGender(String dg);
	public void getBySize(String dsz);
	
	
}
