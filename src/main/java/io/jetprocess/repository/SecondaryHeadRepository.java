package io.jetprocess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.jetprocess.model.SecondaryHead;

public interface SecondaryHeadRepository extends JpaRepository<SecondaryHead, Long> {

	@Query(value ="select * from md_secondaryhead where primaryheadid = ?", nativeQuery = true)
	public List<SecondaryHead> getAllSecondaryHeadsByPrimaryHeadId(long primaryHeadId);
}
