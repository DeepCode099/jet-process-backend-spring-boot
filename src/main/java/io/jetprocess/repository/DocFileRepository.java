package io.jetprocess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.jetprocess.model.DocFile;

public interface DocFileRepository extends JpaRepository<DocFile, Long> {

}
