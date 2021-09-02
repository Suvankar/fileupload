package com.demo.myfileupload.repository;

import com.demo.myfileupload.entity.FileDetails;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "filedetails", path = "filedetails")
public interface FileDetailsRepository extends PagingAndSortingRepository<FileDetails, String> {
    List<FileDetails> findByfileName(@Param("fileName") String fileName);
}