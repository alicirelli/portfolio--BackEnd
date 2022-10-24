package com.backend.portfoliobackend.Interface;

import com.backend.portfoliobackend.Entity.Skill;

import java.util.List;

public interface ISkillService {

    public List<Skill> getSkill();

    public void saveSkill(Skill skill);

    public void deleteSkill(Long id);

    public Skill findSkill(Long id);
}
