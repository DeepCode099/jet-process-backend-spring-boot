package io.jetprocess.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import io.jetprocess.model.TertiaryHead;
import io.jetprocess.repository.TertiaryHeadRepository;
import io.jetprocess.service.TertiaryHeadService;

@Service
public class TertiaryHeadServiceImpl implements TertiaryHeadService{

	private TertiaryHeadRepository tertiaryHeadRepository;
	
	public TertiaryHeadServiceImpl(TertiaryHeadRepository tertiaryHeadRepository) {
		super();
		this.tertiaryHeadRepository = tertiaryHeadRepository;
	}
	
	@Override
	public List<TertiaryHead> getAllTertiaryHeadsBySecodaryHeadId(long secondaryHeadId) {
		return tertiaryHeadRepository.getAllTertiaryHeadsBySecondaryHeadId(secondaryHeadId);
	}
	
}
