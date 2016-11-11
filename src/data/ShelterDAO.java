package data;

import java.util.ArrayList;

import entities.Cat;
import entities.Dog;

public interface ShelterDAO {
	public ArrayList<Cat> getCats();
	public ArrayList<Dog> getDogs();
	public ArrayList<Cat> addCatToShelter(Cat cat);
	public ArrayList<Cat> removeCatFromShelter(String rc);
	public ArrayList<Cat> addCatNotes(String addCN, String catName);
	public String updateCatNotes (String updCN, String addCN);
	public void getCatByGender(String cg);
	public void getCatsBySize(String csz);
	public ArrayList<Dog> addDogToShelter(Dog dog);
	public ArrayList<Dog> removeDogFromShelter(String remD);
	public void addDogNotes(String addDN, String dogNam);
	public void updateDogNotes (String updDN);
	public void getDogByGender(String dg);
	public void getBySize(String dsz);
	public ArrayList<Dog> getAllDogs();
	public ArrayList<Cat> getAllCats();
	
	
	
}
