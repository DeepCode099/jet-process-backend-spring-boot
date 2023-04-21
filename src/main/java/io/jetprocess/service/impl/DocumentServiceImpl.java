package io.jetprocess.service.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Clock;
import java.util.Date;
import java.util.List;
import java.util.Optional;
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
		// Get Extension
		String extension = name.substring(name.lastIndexOf("."));
		// split full name with [.] .
		String[] nameArray = name.split(".pdf");
		// initialize a variable
		String fileNameWithoutExtension = null;
		for (int i = 0; i < nameArray.length; i++) {
			fileNameWithoutExtension = nameArray[0];
		}
		// create Clock Object
		Clock clock = Clock.systemDefaultZone();
		// get Instant Object of Clock object
		// in milliseconds using millis() method
		long milliseconds = clock.millis();
		// create new FileName with milli seconds and extension
		String newFileName = fileNameWithoutExtension + milliseconds + extension;

		// Generate Random Id
		/*
		 * String randomId = UUID.randomUUID().toString(); String fileName =
		 * randomId.concat(extension);
		 */// Get Full Path

		String fullPath = path + "/" + newFileName;
		// create folder if not created
		File f = new File(path);
		if (!f.exists()) {
			f.mkdir();
		}
		// copy file
		// Files.copy(file.getInputStream(),Paths.get(fullPath));
		// String fullPath = FOLDER_PATH + file.getOriginalFilename();
		Document documentImage = new Document();
		documentImage.setCompanyId(20097);
		documentImage.setGroupId(20123);
		documentImage.setExtension(extension);
		documentImage.setFileName(newFileName);
		documentImage.setMimeType(file.getContentType());
		documentImage.setCreateDate(new Date());
		documentImage.setModifiedDate(new Date());
		documentImage.setTreePath(fullPath);
		file.transferTo(new File(fullPath));
		return documentRepository.save(documentImage);
	}

	@Override
	public byte[] downloadDocument(String fileName) throws IOException {
		Optional<Document> documentObject = documentRepository.findByName(fileName);
		String fullPath = documentObject.get().getTreePath();
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
