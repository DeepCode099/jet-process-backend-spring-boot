package io.jetprocess.service;

import java.util.List;


import io.jetprocess.model.TertiaryHead;

public interface TertiaryHeadService {

	public List<TertiaryHead> getAllTertiaryHeadsBySecodaryHeadId(long secondaryHeadId);
}
