package io.jetprocess.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jetprocess.model.DocFile;
import io.jetprocess.service.DocFileService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/docFile")
public class DocFileController {

	private DocFileService docFileService;
	
	public DocFileController(DocFileService docFileService) {
		super();
		this.docFileService = docFileService;
	}
	
	// build create docFile REST API 
	//http://localhost:8080/api/v1/docFile
	@PostMapping
	public ResponseEntity<DocFile> createDocFile(@RequestBody DocFile docFile){
		return new ResponseEntity<DocFile>(docFileService.createDocFile(docFile) , HttpStatus.OK);
	}
	
	// build get docFile List REST API
    //http://localhost:8080/api/v1/docFile
	@GetMapping
	public List<DocFile> getAllDocFileList(){
		return docFileService.getAllDocFiles();
	}
	
	// build get docFile by docFile ID REST API
    //http://localhost:8080/api/v1/docFile/1
	@GetMapping("{id}")
	public ResponseEntity<DocFile> getDocFileById(@PathVariable("id") long docFileId){
		return new ResponseEntity<DocFile>(docFileService.getDocFileById(docFileId), HttpStatus.OK);
	}
	
	// build update docFile REST API
	// http://localhost:8080/api/docFile/v1/1
	@PutMapping("{id}")
	public ResponseEntity<DocFile> updateDocFile(@PathVariable("id") long id ,@RequestBody DocFile docFile){
		return new ResponseEntity<DocFile>(docFileService.updateDocFile(docFile, id), HttpStatus.OK);
	}
	
	// build delete docFile REST API
	// http://localhost:8080/api/docFile/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteDocFile(@PathVariable("id") long id){
		// delete docFile from DB
		docFileService.deleteDocFile(id);
		return new ResponseEntity<String>("DocFile deleted successfully!.", HttpStatus.OK);
	}

	
	
	
}
