package com.backend.portfoliobackend.Repository;


import com.backend.portfoliobackend.Entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ILanguageRepository extends JpaRepository<Language,Long> {
    public Optional<Language> findByIdioma(String idioma);
    public boolean existsByIdioma(String idioma);
}
