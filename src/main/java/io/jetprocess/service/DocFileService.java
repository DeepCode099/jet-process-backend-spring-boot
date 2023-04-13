package io.jetprocess.service;

import java.util.List;

import io.jetprocess.model.DocFile;

public interface DocFileService {

	public DocFile createDocFile(DocFile docFile);

	public List<DocFile> getAllDocFiles();

	public DocFile getDocFileById(long docFileId);

	public DocFile updateDocFile(DocFile docFile, long docFileId);

	public void deleteDocFile(long docFileId);
	
	/* public String generateFileNo(DocFile docFile); */
}
