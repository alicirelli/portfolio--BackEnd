package com.backend.portfoliobackend.Repository;

import com.backend.portfoliobackend.Entity.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAboutRepository extends JpaRepository<About,Long> {
    public Optional<About> findByTitulo(String titulo);
    public boolean existsByTitulo(String titulo);
}
