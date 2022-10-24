package com.backend.portfoliobackend.Service;

import com.backend.portfoliobackend.Entity.Education;
import com.backend.portfoliobackend.Interface.IEducationService;
import com.backend.portfoliobackend.Repository.IEducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ImpEducationService implements IEducationService {


    @Autowired
    IEducationRepository ieducationRepository;

    @Override
    public List<Education> getEducation() {
        List<Education> education = ieducationRepository.findAll();
        return education;
    }

    @Override
    public void saveEducation(Education education) {
        ieducationRepository.save(education);

    }

    @Override
    public void deleteEducation(Long id) {
        ieducationRepository.deleteById(id);

    }

    @Override
    public Education findEducation(Long id) {
        Education education = ieducationRepository.findById(id).orElse(null);
        return education;
    }
}
