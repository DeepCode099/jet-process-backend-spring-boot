package io.jetprocess.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jetprocess.model.SecondaryHead;
import io.jetprocess.service.SecondaryHeadService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/jetprocess/secondaryhead")
public class SecondaryHeadController {

	private SecondaryHeadService secondaryHeadService;

	public SecondaryHeadController(SecondaryHeadService secondaryHeadService) {
		super();
		this.secondaryHeadService = secondaryHeadService;
	}
	
	// build get SecondaryheadsList by primaryHeadId REST API
	// http://localhost:8080/api/v1/jetprocess/secondaryhead/{primaryHeadId}
	@GetMapping("{primaryHeadId}")
	public List<SecondaryHead> getAllSecondaryHeadsListByPrimaryHeadId(@PathVariable long primaryHeadId){
		return secondaryHeadService.getAllSecondaryHeadsByPrimaryHeadId(primaryHeadId);	
	}
	
	
}
