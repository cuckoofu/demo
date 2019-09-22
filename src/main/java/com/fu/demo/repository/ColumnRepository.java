package com.fu.demo.repository;

import com.fu.demo.model.ExpandoColumn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColumnRepository extends JpaRepository<ExpandoColumn, Long> {

    public List<ExpandoColumn> findByTableid(long tableid);

}
