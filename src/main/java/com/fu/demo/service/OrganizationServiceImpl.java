package com.fu.demo.service;

import com.fu.demo.model.ExpandoColumn;
import com.fu.demo.model.ExpandoRow;
import com.fu.demo.model.ExpandoValue;
import com.fu.demo.model.Organization;
import com.fu.demo.repository.ColumnRepository;
import com.fu.demo.repository.OrganizationRepository;
import com.fu.demo.repository.RowRepository;
import com.fu.demo.repository.ValueRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
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

        for (ExpandoColumn column: columns) {
            ExpandoRow row = rowRepository.findByClasspk(orgId);
            ExpandoValue value = valueRepository.findByColumnidAndRowid(row.getRowid_(), column.getColumnid());
            if (value != null && value.getData_() != null && value.getData_() != "" ) {
                column.setDefaultdata(value.getData_());
            }
        }

        return columns;
    }

    @Override
    public void saveCustomField(String fieldName, String fieldValue) {
        ExpandoColumn expandoColumn = new ExpandoColumn();
        expandoColumn.setName(fieldName);
        expandoColumn.setDefaultdata(fieldValue);
        expandoColumn.setType_(0);
        expandoColumn.setTableid(4001);
        columnRepository.save(expandoColumn);
    }

    @Override
    public void saveOrUpdateFieldValue(String orgId, String fieldValue) {

        ExpandoRow row = rowRepository.findByClasspk(Long.parseLong(orgId));
        Long rowId = row.getRowid_();

        String fields[] = fieldValue.split(",");
        HashMap<Long, String> maps = new HashMap<Long, String>();

        for (int i = 0; i < fields.length; i++) {
            String columns[] = fields[i].split("=");
            if (columns[0] != "" && columns[1] != "") {
                maps.put(Long.parseLong(columns[0]), columns[1]);
            }
        }

        ExpandoValue expandoValue = new ExpandoValue();
        expandoValue.setClassnameid(1001);
        expandoValue.setClasspk(Long.parseLong(orgId));
        expandoValue.setCompanyid(1001);
        expandoValue.setRowid(rowId);
        expandoValue.setTableid(4001);

        ArrayList<ExpandoValue> saveValues = new ArrayList<ExpandoValue>();
        ArrayList<ExpandoValue> updateValues = new ArrayList<ExpandoValue>();
        for (Map.Entry<Long, String> entry : maps.entrySet()) {
            expandoValue.setColumnid(entry.getKey());
            expandoValue.setData_(entry.getValue());
            ExpandoValue value = valueRepository.findByColumnidAndRowid(entry.getKey(), rowId);
            try {
                if (value == null) {
                    saveValues.add(expandoValue);
                } else {
                    value.setData_(entry.getValue());
                    saveValues.add(value);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        for (ExpandoValue value: saveValues) {
            valueRepository.save(value);
            valueRepository.flush();
        }

        for (ExpandoValue value: updateValues) {
            valueRepository.save(value);
            valueRepository.flush();
        }
    }
}
