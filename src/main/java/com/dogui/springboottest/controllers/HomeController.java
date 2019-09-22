package com.dogui.springboottest.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dogui.springboottest.helpers.ViewRouteHelper;
import com.dogui.springboottest.models.DegreeModel;


@Controller
@RequestMapping("/")
public class HomeController {

	
	@GetMapping("/degree")
	public static String degree(Model model) {
		model.addAttribute("degree",new DegreeModel());
		return ViewRouteHelper.DEGREE;
	}	
	
	@PostMapping("/newdegree")
	public ModelAndView newdegree(@Valid @ModelAttribute("degree") DegreeModel degree,BindingResult bindingResult) {
		ModelAndView mV = new ModelAndView();
		if (bindingResult.hasErrors()) {
			mV.setViewName(ViewRouteHelper.DEGREE);
			
		}else {
			mV.setViewName(ViewRouteHelper.NEW_DEGREE);
			mV.addObject("degree", degree);
		}
		return mV;
		
	}
	
	
	
	
	
	
}
