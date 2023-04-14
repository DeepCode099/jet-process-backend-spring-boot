package io.jetprocess.service;

import java.util.List;

import io.jetprocess.model.PrimaryHead;

public interface PrimaryHeadService {

	public List<PrimaryHead> getAllPrimaryHeadsByBasicHeadId(long basicHeadId);

}
 