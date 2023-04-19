package io.jetprocess.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.jetprocess.model.Document;
import io.jetprocess.service.DocumentService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/document")
public class DocumentController {

	
	@Autowired
	private DocumentService documentService;

	@Value("${file.upload-dir}")
	private String path;
	
	@PostMapping("/upload")
	public ResponseEntity<Document> uploadDocument(@RequestParam("documentImage") MultipartFile file) throws IOException{
		return new ResponseEntity<Document>(documentService.uploadDocumentToFileSystem(path,file), HttpStatus.OK);
	}

	@GetMapping("/download/{documentName}")
	public ResponseEntity<byte[]> downloadDocument(@PathVariable String documentName) throws IOException {
		byte[] image = documentService.downloadDocument(documentName);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png")).body(image);
	}
	
	@GetMapping
	public List<Document> getAllUploadedDocumentList() {
		return documentService.getAllUploadedDocumentList();
	}
	
}
