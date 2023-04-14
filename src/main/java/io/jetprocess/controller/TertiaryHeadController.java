package io.jetprocess.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jetprocess.model.TertiaryHead;
import io.jetprocess.service.TertiaryHeadService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/jetprocess/tertiaryhead")
public class TertiaryHeadController {
	
	
	private TertiaryHeadService tertiaryHeadService;

	public TertiaryHeadController(TertiaryHeadService tertiaryHeadService) {
		super();
		this.tertiaryHeadService = tertiaryHeadService;
	}
	// build get TertiaryheadsList by SecondaryHeadId REST API
	// http://localhost:8080/api/v1/jetprocess/tertiaryhead/{secondaryHeadId}
	@GetMapping("/{secondaryHeadId}")
	public List<TertiaryHead> getAllTertiaryHeadsListBySecondaryHeadId(@PathVariable long secondaryHeadId){
		return tertiaryHeadService.getAllTertiaryHeadsBySecodaryHeadId(secondaryHeadId);	
	}
	

}
