package com.fivehalf.core.service.schoolquery;

import com.fivehalf.core.model.School;
import com.fivehalf.core.service.SchoolService;
import com.fivehalf.core.service.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "schoolService")
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public School querySchoolInfo(String name){
        School school = schoolRepository.querySchool("上海实验小学");
        return school;
    }
}
