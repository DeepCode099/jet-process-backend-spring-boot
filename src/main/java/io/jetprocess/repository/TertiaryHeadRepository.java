package io.jetprocess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.jetprocess.model.TertiaryHead;

public interface TertiaryHeadRepository  extends JpaRepository<TertiaryHead, Long>{
	@Query(value = "select * from md_tertiaryhead where secondaryheadid = ?", nativeQuery = true)
	public List<TertiaryHead> getAllTertiaryHeadsBySecondaryHeadId(long secondaryHeadId);
}
