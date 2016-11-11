package controllers;

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
	@RequestMapping(path = "addCatNotes.do", params = "notes", method = RequestMethod.GET)
	public ModelAndView addCatNotes(@RequestParam("notes") String addCN, @RequestParam("catName") String catName) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		shelterDAO.addCatNotes(addCN, catName);
		mv.addObject("cats", shelterDAO.getCats());
		return mv;
	}

	@RequestMapping(path = "updateCatNotes.do", params = "update", method = RequestMethod.GET)
	public ModelAndView updateCatNotes(@RequestParam("name") String updCN) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("result");
		return mv;
	}
	

	@RequestMapping(path = "getCatByGender.do", params = "getByGender", method = RequestMethod.GET)
	public ModelAndView getCatByGender(@RequestParam("name") String cg) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("result");
		return mv;
	}
	
	
	@RequestMapping(path = "getCatsBySize.do", params = "getBySize", method = RequestMethod.GET)
	public ModelAndView getCatsBySize(@RequestParam("name") String csz) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("result");
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
	@RequestMapping(path = "addDogNotes.do", params = "notes", method = RequestMethod.GET)
	public ModelAndView addDogNotes(@RequestParam("name") String addDN) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("result");
		return mv;
	}

	@RequestMapping(path = "updateDogNotes.do", params = "update", method = RequestMethod.GET)
	public ModelAndView updateDogNotes(@RequestParam("name") String updateDN) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("result");
		return mv;
	}
	

	

	@RequestMapping(path = "getDogByGender.do", params = "getByGender", method = RequestMethod.GET)
	public ModelAndView getDogByGender(@RequestParam("name") String dg) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("result");
		return mv;
	}
	
	
	@RequestMapping(path = "getDogBySize.do", params = "getBySize", method = RequestMethod.GET)
	public ModelAndView getDogBySize(@RequestParam("name") String dsz) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("result");
		return mv;
	}
}
