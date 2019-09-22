package com.dogui.springboottest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.dogui.springboottest.helpers.ViewRouteHelper;
import com.dogui.springboottest.models.DegreeModel;
import com.dogui.springboottest.services.IDegreeService;

@Controller
@RequestMapping("/degrees")
public class DegreeController {
	
	@Autowired
	@Qualifier("degreeService")
	private IDegreeService degreeService;
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.DEGREE_INDEX);
		mAV.addObject("degrees", degreeService.getAll());
		mAV.addObject("degree", new DegreeModel());
		return mAV;
	}
	
	
	@PostMapping("/")
	public RedirectView create(@ModelAttribute("degree") DegreeModel degreeModel) {
		degreeService.insertOrUpdate(degreeModel);
		return new RedirectView(ViewRouteHelper.DEGREE_ROOT);
	}
	
	
	
	

}
