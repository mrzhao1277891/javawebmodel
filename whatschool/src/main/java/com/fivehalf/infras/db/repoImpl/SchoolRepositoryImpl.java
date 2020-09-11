package com.fivehalf.infras.db.repoImpl;

import com.fivehalf.core.model.School;
import com.fivehalf.core.service.repository.SchoolRepository;
import com.fivehalf.infras.db.dao.SchoolInfoDOMapper;
import com.fivehalf.infras.db.entity.SchoolInfoDO;
import org.springframework.beans.BeanUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository
public class SchoolRepositoryImpl implements SchoolRepository {

//    @Autowired
//    SchoolInfoDOMapper schoolInfoDOMapper;

    @Override
    public School querySchool(String schoolName){

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        SchoolInfoDOMapper schoolInfoDOMapper = (SchoolInfoDOMapper) ac.getBean("schoolInfoDOMapper");

        SchoolInfoDO schoolInfoDO = schoolInfoDOMapper.selectByPrimaryKey(schoolName);
        School school = new School();
        BeanUtils.copyProperties(schoolInfoDO, school);

        return school;
    }
}
