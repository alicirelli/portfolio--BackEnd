package com.backend.portfoliobackend.Repository;

import com.backend.portfoliobackend.Entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IExperienceRepository extends JpaRepository<Experience,Long> {
    public Optional<Experience> findByPuesto(String puesto);
    public boolean existsByPuesto(String puesto);
}
