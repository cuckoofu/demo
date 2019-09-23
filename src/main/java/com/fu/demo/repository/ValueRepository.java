package com.fu.demo.repository;

import com.fu.demo.model.ExpandoValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ValueRepository extends JpaRepository<ExpandoValue, Long> {

    @Transactional
    public ExpandoValue findByColumnidAndRowid(Long columnId, long rowId);
}
