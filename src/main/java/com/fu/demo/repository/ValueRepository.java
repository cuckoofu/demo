package com.fu.demo.repository;

import com.fu.demo.model.ExpandoValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValueRepository extends JpaRepository<ExpandoValue, Long> {
    
}
