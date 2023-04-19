package io.jetprocess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.jetprocess.model.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{

    public Document findByFileName(String fileName);
	
}
