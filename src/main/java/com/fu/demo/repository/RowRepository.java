package com.fu.demo.repository;

import com.fu.demo.model.ExpandoRow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RowRepository extends JpaRepository<ExpandoRow, Long> {

    public ExpandoRow findByClasspk(long orgId);
}
