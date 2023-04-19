package io.jetprocess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.jetprocess.model.PrimaryHead;

public interface PrimaryHeadRepositroy extends JpaRepository<PrimaryHead, Long> {

	@Query(value = "select * from md_primaryhead where basicheadid = ?", nativeQuery = true)
	public List<PrimaryHead> getAllPrimaryHeadsByBasicHeadId(long basicHeadId);

	
}
