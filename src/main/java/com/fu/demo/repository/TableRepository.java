package com.fu.demo.repository;

import com.fu.demo.model.ExpandoTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<ExpandoTable, Long> {
}
