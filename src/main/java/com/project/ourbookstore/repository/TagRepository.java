package com.project.ourbookstore.repository;

import com.project.ourbookstore.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
