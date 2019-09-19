package com.fu.demo.service;

import com.fu.demo.model.ExpandoRow;
import com.fu.demo.repository.RowRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RowServiceImpl implements RowService {

    @Autowired
    private RowRepository rowRepository;

    @Override
    public List<ExpandoRow> getResourceList() {
        List<ExpandoRow> expandoRows = rowRepository.findAll();
        return null;
    }
}