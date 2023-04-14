package io.jetprocess.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jetprocess.model.PrimaryHead;
import io.jetprocess.service.PrimaryHeadService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/jetprocess/primaryhead")
public class PrimaryHeadController {
	
	private PrimaryHeadService primaryHeadService;

	public PrimaryHeadController(PrimaryHeadService primaryHeadService) {
		super();
		this.primaryHeadService = primaryHeadService;
	}
	// build get PrimaryheadsList by basicHeadId REST API
	// http://localhost:8080/api/v1/jetprocess/primaryhead/{basicHeadId}
	@GetMapping("/{basicHeadId}")
	public List<PrimaryHead> getAllPrimaryHeadsListByBasicHeadId(@PathVariable Long basicHeadId) {
		return primaryHeadService.getAllPrimaryHeadsByBasicHeadId(basicHeadId);
	}
  
}
