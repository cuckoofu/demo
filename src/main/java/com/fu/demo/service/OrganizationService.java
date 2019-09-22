package com.fu.demo.service;

import com.fu.demo.model.ExpandoColumn;
import com.fu.demo.model.Organization;

import java.util.List;

public interface OrganizationService {

    public List<Organization> getOrgList();
    
    public List<ExpandoColumn> getCustomFieldByOrgId(long orgId);

    public void saveCustomField(String fieldName, String fieldValue);
}
