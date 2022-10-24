package com.backend.portfoliobackend.Repository;


import com.backend.portfoliobackend.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProjectRepository extends JpaRepository<Project,Long> {
    public Optional<Project> findByTitulo(String titulo);
    public boolean existsByTitulo(String titulo);
}
