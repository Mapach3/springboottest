package com.dogui.springboottest.converters;

import org.springframework.stereotype.Component;

import com.dogui.springboottest.entities.Degree;
import com.dogui.springboottest.models.DegreeModel;

@Component("degreeConverter")
public class DegreeConverter {

	public DegreeModel entityToModel(Degree degree) {
		return new DegreeModel(degree.getId(), degree.getName(), degree.getInstitution(), degree.getYear());
	}

	public Degree modelToEntity(DegreeModel degreeModel) {
		return new Degree(degreeModel.getId(), degreeModel.getName(), degreeModel.getInstitution(),
				degreeModel.getYear());
	}
	
	
	

}
