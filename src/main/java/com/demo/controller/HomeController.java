package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	/*@RequestMapping("/home")
	public String home(Model model) {
		List<String> list = new ArrayList<String>();

		list.add("sumitra");
		list.add("rutuja");
		list.add("sonali");
		model.addAttribute("list", list);

		return "home";

	}*/
	@RequestMapping("/home")
	public ModelAndView home() {
		List<String> list = new ArrayList<String>();

		list.add("sumitra");
		list.add("rutuja");
		list.add("sonali");
ModelAndView mv=new ModelAndView();
mv.setViewName("home");
mv.addObject("list",list);
return mv;
		

	}
	@RequestMapping("/do")
	public String name(@RequestParam("name") String name,@RequestParam("id") int id,Model model)
	{
		model.addAttribute("name",name);
		model.addAttribute("id",id);
		return "details";
		
	}
	@RequestMapping("/user")
	public String about()
	{
	
		return "user";
	}
	

}
