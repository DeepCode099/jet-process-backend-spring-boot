package io.jetprocess.service;

import java.util.List;

import io.jetprocess.model.SecondaryHead;

public interface SecondaryHeadService {

	public List<SecondaryHead> getAllSecondaryHeadsByPrimaryHeadId(long primaryHeadId);
	
}

