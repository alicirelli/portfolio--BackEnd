package com.backend.portfoliobackend.Repository;

import com.backend.portfoliobackend.Entity.Education;
import com.backend.portfoliobackend.Entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IEducationRepository extends JpaRepository<Education,Long> {
    public Optional<Education> findByTitulo(String titulo);
    public boolean existsByTitulo(String titulo);
}
