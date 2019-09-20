package com.fu.demo.service;

import com.fu.demo.model.ExpandoColumn;
import com.fu.demo.model.ExpandoRow;
import com.fu.demo.model.Organization;
import com.fu.demo.repository.ColumnRepository;
import com.fu.demo.repository.OrganizationRepository;
import com.fu.demo.repository.RowRepository;
import com.fu.demo.repository.ValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Autowired
    private RowRepository rowRepository;

    @Autowired
    private ColumnRepository columnRepository;

    @Autowired
    private ValueRepository valueRepository;

    public List<Organization> getOrgList() {
        return organizationRepository.findAll();
    }

    @Override
    public List<ExpandoColumn> getCustomFieldByOrgId(long orgId) {

        ExpandoRow expandoRow = rowRepository.findByClasspk(orgId);
        List<ExpandoColumn> columns =  columnRepository.findByTableid(expandoRow.getTableid());

        return columns;
    }
}
