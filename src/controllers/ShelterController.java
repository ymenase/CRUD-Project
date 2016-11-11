package controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import data.ShelterDAO;
import entities.Cat;
import entities.Dog;
	
@Controller
public class ShelterController {
	@Autowired
	private ShelterDAO shelterDAO;
	
	
	@RequestMapping("catsIndex.do")
	public ModelAndView getAllCats(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("cats", shelterDAO.getCats());
		return mv;
	}
	@RequestMapping("dogsIndex.do")
	public ModelAndView getAllDogs(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dogs.jsp");
		mv.addObject("dogs", shelterDAO.getDogs());
		return mv;
	}
	
	
	@RequestMapping(path = "addCatToShelter.do", params = "add", method = RequestMethod.GET)
	public ModelAndView addCatToShelter(Cat cat)  {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("cats", shelterDAO.addCatToShelter(cat));
		return mv;
	}
	
	@RequestMapping(path = "removeCatFromShelter.do", params = "remove", method = RequestMethod.GET)
	public ModelAndView removeCatFromShelter(@RequestParam("remove") String rc) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("cats", shelterDAO.removeCatFromShelter(rc));
		return mv;
		
	}

	
	@RequestMapping(path = "updateCatNotes.do", method = RequestMethod.GET)
	public ModelAndView updateCatNotes(@RequestParam("note") String note, @RequestParam("name") String name){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("cats", shelterDAO.updateCatNotes(note, name)); //return cats from DAO and updated note view
		return mv;
	}
	@RequestMapping(path = "clearCatNotes.do", method = RequestMethod.GET)
	public ModelAndView clearCatNotes(@RequestParam("clear") String name){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("cats", shelterDAO.clearCatNotes(name)); //return cats from DAO and updated note view
		return mv;
	}
	

	@RequestMapping(path = "filterCatsByGender.do", method = RequestMethod.GET)
	public ModelAndView getCatsByGender(@RequestParam("gender") String cg) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("filteredCatsG.jsp");
		ArrayList<Cat> filteredCats = shelterDAO.getCatsByGender(cg);
		mv.addObject("catsByGender", filteredCats); //add to filteredarray
		return mv;
	}
	
	
	@RequestMapping(path = "filterCatsBySize.do", method = RequestMethod.GET)
	public ModelAndView getCatsBySize(@RequestParam("size") String csize) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("filteredCatsS.jsp");
		ArrayList<Cat> filteredCatsS = shelterDAO.getCatsBySize(csize);
		mv.addObject("catsBySize", filteredCatsS);
		return mv;
	}
	
	@RequestMapping(path = "addDogToShelter.do", params = "add", method = RequestMethod.GET)
	public ModelAndView addDogToShelter(Dog dog)  {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dogs.jsp");
		mv.addObject("dogs", shelterDAO.addDogToShelter(dog));
		return mv;
	}
	

	@RequestMapping(path = "removeDogFromShelter.do", params = "remove", method = RequestMethod.GET)
	public ModelAndView removeDogFromShelter(@RequestParam("remove") String remD) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dogs.jsp");
		mv.addObject("dogs", shelterDAO.removeDogFromShelter(remD));
		return mv;
		
	}


	@RequestMapping(path = "updateDogNotes.do",  method = RequestMethod.GET)
	public ModelAndView updateDogNotes(@RequestParam("note") String note, @RequestParam("name") String name) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dogs.jsp");
		mv.addObject("dogs", shelterDAO.updateDogNotes(note, name));
		return mv;
	}
	
	@RequestMapping(path = "clearDogNotes.do", method = RequestMethod.GET)
	public ModelAndView clearDogNotes(@RequestParam("clear") String name){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("cats", shelterDAO.clearCatNotes(name)); //return cats from DAO and updated note view
		return mv;
	}
	

	@RequestMapping(path = "filterDogsByGender.do", method = RequestMethod.GET)
	public ModelAndView getDogByGender(@RequestParam("gender") String dg) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("filteredDogsG.jsp");
		ArrayList<Dog> filteredDogs = shelterDAO.getDogsByGender(dg);
		mv.addObject("dogsByGender", filteredDogs);
		return mv;
	}

	
	@RequestMapping(path = "filteredDogsByBreed.do", method = RequestMethod.GET)
	public ModelAndView getDogByBreed(@RequestParam("breed") String gbb) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("filteredDogsB.jsp");
		ArrayList<Dog> filteredDogsB = shelterDAO.getDogByBreed(gbb);
		mv.addObject("dogsByBreed", filteredDogsB);
//		System.out.println(filteredDogsB);
		return mv;
	}
}
