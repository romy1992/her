package com.stat.bradip.resource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stat.bradip.resource.entity.FaceFile;

@Repository
public interface FileXmlRepository extends JpaRepository<FaceFile, Integer> {

}
