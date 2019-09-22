package com.fu.demo.controller;

import com.fu.demo.model.ExpandoColumn;
import com.fu.demo.model.Organization;
import com.fu.demo.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class FieldController {

    @Autowired
    private OrganizationService organizationService;

    @RequestMapping("/index")
    public String getOrgList(Model model) {
        List<Organization> orgs = organizationService.getOrgList();
        model.addAttribute("orgs", orgs);
        return "index";
    }

    @RequestMapping("/detail")
    public String viewDetail() {
        return "detail";
    }

    @RequestMapping(value="/field/{orgId}", method = RequestMethod.GET)
    public String getFieldByOrgId(Model model, @PathVariable String orgId) {
        List<Organization> orgs = organizationService.getOrgList();
        List<ExpandoColumn> columns = organizationService.getCustomFieldByOrgId(Long.parseLong(orgId));
        model.addAttribute("columns", columns);
        model.addAttribute("orgId", orgId);
        return "detail";
    }

    @RequestMapping(value="/field/save/{orgId}/{fieldName}/{fieldValue}", method = RequestMethod.GET)
    public String getFieldByOrgId(Model model, @PathVariable String orgId, @PathVariable String fieldName, @PathVariable String fieldValue) {
        organizationService.saveCustomField(fieldName, fieldValue);
        return "detail";
    }
}