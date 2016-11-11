package data;

import java.util.ArrayList;

import entities.Cat;
import entities.Dog;

public interface ShelterDAO {
	public ArrayList<Cat> getCats();
	public ArrayList<Dog> getDogs();
	public ArrayList<Cat> addCatToShelter(Cat cat);
	public ArrayList<Cat> removeCatFromShelter(String rc);
	public ArrayList<Cat> updateCatNotes (String note, String name);
	public ArrayList<Cat> getCatsByGender(String cg);
	public ArrayList<Cat> getCatsBySize(String csize);
	public ArrayList<Dog> addDogToShelter(Dog dog);
	public ArrayList<Dog> removeDogFromShelter(String remD);
	public void updateDogNotes (String updDN);
	public void getDogByGender(String dg);
	public void getDogByBreed(String gbb);
	public ArrayList<Dog> getAllDogs();
	public ArrayList<Cat> getAllCats();
	
	
	
}
