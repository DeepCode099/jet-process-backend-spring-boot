package io.jetprocess.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.jetprocess.model.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{

    //public Document findByFileName(String fileName);
	 @Query(value = "select * from document where file_name= ?", nativeQuery = true)
	 Optional<Document> findByName(String fileName); 
}
