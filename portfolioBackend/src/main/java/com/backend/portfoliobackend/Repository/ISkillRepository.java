package com.backend.portfoliobackend.Repository;

import com.backend.portfoliobackend.Entity.Experience;
import com.backend.portfoliobackend.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ISkillRepository extends JpaRepository<Skill,Long> {
    public Optional<Skill> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
