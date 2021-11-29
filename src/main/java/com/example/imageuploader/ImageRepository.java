package com.example.imageuploader;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ImageRepository extends JpaRepository<ImageModel, Long> {
    @Query("select i from ImageModel i where i.id = ?1")
    <Optional> ImageModel findByImageId (Long id);
}
