package io.jetprocess.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import io.jetprocess.model.SecondaryHead;
import io.jetprocess.repository.SecondaryHeadRepository;
import io.jetprocess.service.SecondaryHeadService;

@Service
public class SecondaryHeadServiceImpl implements SecondaryHeadService {

	
	private SecondaryHeadRepository secondaryHeadRepository;
	
	public SecondaryHeadServiceImpl(SecondaryHeadRepository secondaryHeadRepository) {
		super();
		this.secondaryHeadRepository = secondaryHeadRepository;
	}
	
	@Override
	public List<SecondaryHead> getAllSecondaryHeadsByPrimaryHeadId(long primaryHeadId) {
		return secondaryHeadRepository.getAllSecondaryHeadsByPrimaryHeadId(primaryHeadId);
	}

	
}
