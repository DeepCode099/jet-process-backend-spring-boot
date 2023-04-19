package io.jetprocess.service.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import io.jetprocess.model.Document;
import io.jetprocess.repository.DocumentRepository;
import io.jetprocess.service.DocumentService;

@Service
public class DocumentServiceImpl implements DocumentService {

	// private final String FOLDER_PATH = "C:\\Users\\Admin\\Documents\\images\\";

	@Autowired
	private DocumentRepository documentRepository;

	@Override
	public Document uploadDocumentToFileSystem(String path, MultipartFile file) throws IOException {
		// Get name
		String name = file.getOriginalFilename();
		// Generate Random Id
		String randomId = UUID.randomUUID().toString();
		String fileName = randomId.concat(name.substring(name.lastIndexOf(".")));
		// Get Full Path
		String fullPath = path + "/" + fileName;
		// create folder if not created
		File f = new File(path);
		if (!f.exists()) {
			f.mkdir();
		}
		// copy file
		// Files.copy(file.getInputStream(),Paths.get(fullPath));
		// String fullPath = FOLDER_PATH + file.getOriginalFilename();
		Document documentImage = new Document();
		documentImage.setFileName(fileName);
		documentImage.setMimeType(file.getContentType());
		documentImage.setCompanyId(1);
		documentImage.setCreateDate(new Date());
		documentImage.setModifiedDate(new Date());
		documentImage.setTreePath(fullPath);
		file.transferTo(new File(fullPath));
		return documentRepository.save(documentImage);
	}

	@Override
	public byte[] downloadDocument(String documentName) throws IOException {

		System.out.println("fileName --->" + documentName);
		Document documentObject = documentRepository.findByFileName(documentName);
		System.out.println("documentObject --->" + documentObject);
		String fullPath = documentObject.getTreePath();
		System.out.println("fullPath--->" + fullPath);
		return Files.readAllBytes(new File(fullPath).toPath());
	}

	@Override
	public List<Document> getAllUploadedDocumentList() {
		return documentRepository.findAll();
	}
	
	

	/*
	 * public byte[] downloadDocument(String fileName) throws IOException{
	 * Optional<ProductImage> imageObject = imageRepo.findByName(fileName); String
	 * fullPath = imageObject.get().getImagePath(); return Files.readAllBytes(new
	 * File(fullPath).toPath()); }
	 */
}
