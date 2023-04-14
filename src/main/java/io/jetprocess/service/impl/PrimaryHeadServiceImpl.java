package io.jetprocess.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import io.jetprocess.model.PrimaryHead;
import io.jetprocess.repository.PrimaryHeadRepositroy;
import io.jetprocess.service.PrimaryHeadService;

@Service
public class PrimaryHeadServiceImpl implements PrimaryHeadService {

	private PrimaryHeadRepositroy primaryHeadRepositroy;
	
	
	public PrimaryHeadServiceImpl(PrimaryHeadRepositroy primaryHeadRepositroy) {
		super();
		this.primaryHeadRepositroy = primaryHeadRepositroy;
	}
	
	@Override
	public List<PrimaryHead> getAllPrimaryHeadsByBasicHeadId(long basicHeadId) {
		return primaryHeadRepositroy.getAllPrimaryHeadsByBasicHeadId(basicHeadId);
	}

	
}
