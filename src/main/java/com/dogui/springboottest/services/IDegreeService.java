package com.dogui.springboottest.services;

import java.util.List;

import com.dogui.springboottest.entities.Degree;
import com.dogui.springboottest.models.DegreeModel;

public interface IDegreeService {
	
	public List<Degree> getAll();
	
	public DegreeModel insertOrUpdate(DegreeModel degreeModel);
	
	public boolean remove(int id);
	
	

}
