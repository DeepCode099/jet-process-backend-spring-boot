package io.jetprocess.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import io.jetprocess.model.Document;

public interface DocumentService {
	
	public Document uploadDocumentToFileSystem(String path , MultipartFile file) throws IOException;
	
	public byte[] downloadDocument(String fileName) throws IOException;
	
	public List<Document> getAllUploadedDocumentList();
	
	public void delete(long id);
	
	public List<Document> uploadMultiple(String path , MultipartFile[] file) throws IOException;
}
