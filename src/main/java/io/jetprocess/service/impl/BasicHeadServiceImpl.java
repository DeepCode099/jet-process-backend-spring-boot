package io.jetprocess.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import io.jetprocess.model.BasicHead;
import io.jetprocess.repository.BasicHeadRepository;
import io.jetprocess.service.BasicHeadService;

@Service
public class BasicHeadServiceImpl implements BasicHeadService{

	private BasicHeadRepository basicHeadRepository;
	
	public BasicHeadServiceImpl(BasicHeadRepository basicHeadRepository) {
		super();
		this.basicHeadRepository = basicHeadRepository;
	}
	
	@Override
	public List<BasicHead> getAllBasicHeadList() {
		return basicHeadRepository.findAll();

}
}