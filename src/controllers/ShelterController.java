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
	
	
	@RequestMapping("index.do")
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("cats", shelterDAO.getCats());
		return mv;
	}
	
	
	@RequestMapping(path = "getAllCats.do", params =  "all", method = RequestMethod.GET)
	public ModelAndView getAllCats(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("result");
		return mv;
	}
	
	@RequestMapping(path = "addCatToShelter.do", params = "add", method = RequestMethod.GET)
	public ModelAndView addCatToShelter(Cat cat)  {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("result");
		return mv;
	}
	

	@RequestMapping(path = "removeCatFromShelter.do", params = "remove", method = RequestMethod.GET)
	public ModelAndView removeCatFromShelter(@RequestParam("name") String rc) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("result");
		return mv;
		
	}
	@RequestMapping(path = "addCatNotes.do", params = "notes", method = RequestMethod.GET)
	public ModelAndView addCatNotes(@RequestParam("name") String addCN) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("result");
		return mv;
	}

	@RequestMapping(path = "updateCatNotes.do", params = "update", method = RequestMethod.GET)
	public ModelAndView updateCatNotes(@RequestParam("name") String updCN) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("result");
		return mv;
	}
	

	@RequestMapping(path = "getCatByAge.do", params = "getByAge", method = RequestMethod.GET)
	public ModelAndView getCatByAge(@RequestParam("name") String ca) {
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
	
	@RequestMapping(path = "getAllDogs.do", params =  "all", method = RequestMethod.GET)
	public ModelAndView getAllDogs(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("result");
		return mv;
	}
	
	@RequestMapping(path = "addDogToShelter.do", params = "add", method = RequestMethod.GET)
	public ModelAndView addDogToShelter(Dog dog)  {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("result");
		return mv;
	}
	

	@RequestMapping(path = "removeDogFromShelter.do", params = "remove", method = RequestMethod.GET)
	public ModelAndView removeDogFromShelter(@RequestParam("name") String remD) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("result");
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
	

	@RequestMapping(path = "getDogByAge.do", params = "getByAge", method = RequestMethod.GET)
	public ModelAndView getDogByAge(@RequestParam("name") String da) {
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
