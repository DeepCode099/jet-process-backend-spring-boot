package io.jetprocess.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import io.jetprocess.exception.ResourceNotFoundException;
import io.jetprocess.model.DocFile;
import io.jetprocess.repository.DocFileRepository;
import io.jetprocess.service.DocFileService;

@Service
public class DocFileServiceImpl implements DocFileService {

	private DocFileRepository docFileRepository;

	public DocFileServiceImpl(DocFileRepository docFileRepository) {
		super();
		this.docFileRepository = docFileRepository;
	}

	@Override
	public DocFile createDocFile(DocFile docFile) {
		if (docFile.getType().equals("SFS")) {
			docFile.setHeadId(0);
		}
		docFile.setCreateDate(new Date());
		docFile.setModifiedDate(new Date());
		
		/*
		 * else if(docFile.getType().equals("NON-SFS")) { String fileNo =
		 * generateFileNo(docFile); docFile.setFileNo(fileNo); } return
		 * docFileRepository.save(docFile);
		 */

		return docFileRepository.save(docFile);
	}

	@Override
	public List<DocFile> getAllDocFiles() {
		return docFileRepository.findAll();
	}

	@Override
	public DocFile getDocFileById(long docFileId) {
		return docFileRepository.findById(docFileId)
				.orElseThrow(() -> new ResourceNotFoundException("DocFile", "Id", docFileId));
	}

	@Override
	public DocFile updateDocFile(DocFile docFile, long docFileId) {
		DocFile existingDocFile = docFileRepository.findById(docFile.getId())
				.orElseThrow(() -> new ResourceNotFoundException("DocFile", "Id", docFileId));
		existingDocFile.setGroupId(docFile.getGroupId());
		existingDocFile.setCompanyId(docFile.getCompanyId());
		existingDocFile.setUserId(docFile.getUserId());
		existingDocFile.setUserName(docFile.getUserName());
		existingDocFile.setModifiedDate(new Date());
		existingDocFile.setNature(docFile.getNature());
		existingDocFile.setType(docFile.getNature());
		existingDocFile.setHeadId(docFile.getHeadId());
		existingDocFile.setFileCodeId(docFile.getFileCodeId());
		existingDocFile.setSubject(docFile.getSubject());
		existingDocFile.setFileNo(docFile.getFileNo());
		existingDocFile.setCategoryId(docFile.getCategoryId());
		existingDocFile.setRemarks(docFile.getRemarks());
		existingDocFile.setReference(docFile.getReference());
		existingDocFile.setYear(docFile.getYear());
		existingDocFile.setUserPostId(docFile.getUserPostId());
		existingDocFile.setCurrentUser(docFile.getCurrentUser());
		existingDocFile.setCurrentState(docFile.getCurrentState());
		existingDocFile.setDealingOrganizationId(docFile.getDealingOrganizationId());
		return docFileRepository.save(existingDocFile);
	}

	@Override
	public void deleteDocFile(long docFileId) {
		docFileRepository.findById(docFileId)
				.orElseThrow(() -> new ResourceNotFoundException("DocFile", "Id", docFileId));
		docFileRepository.deleteById(docFileId);
	}

	/*
	 * @Override public String generateFileNo(DocFile docFile) { String number =
	 * String.valueOf(docFile.getId()); String fileNo = 'F' + number; return fileNo;
	 * }
	 */
}
