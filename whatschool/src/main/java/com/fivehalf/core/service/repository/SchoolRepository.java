package com.fivehalf.core.service.repository;


import com.fivehalf.core.model.School;

public interface SchoolRepository {

    public School querySchool(String schoolName);
}
