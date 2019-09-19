package com.fu.demo.repository;

import com.fu.demo.model.ExpandoColumn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColumnRepository extends JpaRepository<ExpandoColumn, Long> {
    
}
