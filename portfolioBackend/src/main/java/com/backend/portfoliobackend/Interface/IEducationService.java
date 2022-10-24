package com.backend.portfoliobackend.Interface;

import com.backend.portfoliobackend.Entity.Education;


import java.util.List;

public interface IEducationService {

    public List<Education> getEducation();

    public void saveEducation(Education education);

    public void deleteEducation(Long id);

    public Education findEducation(Long id);

}
