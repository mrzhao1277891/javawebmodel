package com.fivehalf.controller;

import com.fivehalf.core.model.School;
import com.fivehalf.core.service.SchoolService;
import com.fivehalf.core.service.schoolquery.SchoolServiceImpl;
import com.fivehalf.model.SchoolEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@Controller
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "/school/query", method = RequestMethod.GET)
    public String querySchool(@ModelAttribute("schoolName") String schoolName, ModelMap modelMap){

        School schoolInfo = schoolService.querySchoolInfo(schoolName);

        SchoolEntity schoolEntity = new SchoolEntity();
        schoolEntity.setName(schoolInfo.getName());
        schoolEntity.setInfo(schoolInfo.getInfo());
        modelMap.addAttribute("school", schoolEntity);

        return "school/schoollist";

    }

    private String getName(HttpServletRequest request) {
        String schoolName = request.getParameter("name");
        if (schoolName == null || schoolName.trim().isEmpty()) {
            return null;
        }
        return schoolName;
    }

    private School encoding(School school) throws UnsupportedEncodingException {
        String name = school.getName();
        String schoolInfo = school.getInfo();

        if (name != null && !name.trim().isEmpty()) {
            name = new String(name.getBytes("ISO-8859-1"), "utf-8");
            school.setName(name);
        }
        if (schoolInfo != null && !schoolInfo.trim().isEmpty()) {
            schoolInfo = new String(schoolInfo.getBytes("ISO-8859-1"), "utf-8");
            school.setInfo(schoolInfo);
        }

        return school;
    }

    private String getUrl(HttpServletRequest request) {
        String contextPath = request.getContextPath();
        String servletPath = request.getServletPath();
        String queryString = request.getQueryString();

        if (queryString.contains("&pc=")) {
            int index = queryString.lastIndexOf("&pc=");
            queryString = queryString.substring(0, index);
        }

        return contextPath + servletPath + "?" + queryString;
    }
}
