package com.backend.portfoliobackend.Service;

import com.backend.portfoliobackend.Entity.Skill;
import com.backend.portfoliobackend.Interface.ISkillService;
import com.backend.portfoliobackend.Repository.ISkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ImpSkillService implements ISkillService {


    @Autowired
    ISkillRepository iskillRepository;

    @Override
    public List<Skill> getSkill() {
        List<Skill> skill = iskillRepository.findAll();
        return skill;
    }

    @Override
    public void saveSkill(Skill skill) {
        iskillRepository.save(skill);

    }

    @Override
    public void deleteSkill(Long id) {
        iskillRepository.deleteById(id);

    }

    @Override
    public Skill findSkill(Long id) {
        Skill skill = iskillRepository.findById(id).orElse(null);
        return skill;
    }
}
