package io.jetprocess.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jetprocess.model.BasicHead;
import io.jetprocess.service.BasicHeadService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/jetprocess/basichead")
public class BasicHeadController {

	private BasicHeadService basicHeadService;

	public BasicHeadController(BasicHeadService basicHeadService) {
		super();
		this.basicHeadService = basicHeadService;
	}
	// build get BasicHeads List REST API
	// http://localhost:8080/api/v1/jetprocess/basichead
	@GetMapping
	public List<BasicHead> getAllBasicHeadsList(){
		return basicHeadService.getAllBasicHeadList();	
	}
 	
}
