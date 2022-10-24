package com.backend.portfoliobackend.Service;


import com.backend.portfoliobackend.Entity.Experience;
import com.backend.portfoliobackend.Interface.IExperienceService;
import com.backend.portfoliobackend.Repository.IExperienceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ImpExperienceService implements IExperienceService {


    @Autowired
    IExperienceRepository iExperienceRepository;

    @Override
    public List<Experience> getExperience() {
        List<Experience> Experience = iExperienceRepository.findAll();
        return Experience;
    }

    @Override
    public void saveExperience(Experience Experience) {
        iExperienceRepository.save(Experience);

    }

    @Override
    public void deleteExperience(Long id) {
        iExperienceRepository.deleteById(id);

    }

    @Override
    public Experience findExperience(Long id) {
       Experience Experience = iExperienceRepository.findById(id).orElse(null);
        return Experience;
    }
}
