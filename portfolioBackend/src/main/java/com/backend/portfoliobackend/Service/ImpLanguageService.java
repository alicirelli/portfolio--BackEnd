package com.backend.portfoliobackend.Service;


import com.backend.portfoliobackend.Entity.Language;
import com.backend.portfoliobackend.Interface.ILanguageService;

import com.backend.portfoliobackend.Repository.ILanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ImpLanguageService implements ILanguageService {

    @Autowired
    ILanguageRepository ilanguageRepository;

    @Override
    public List<Language> getLanguage() {
        List<Language> language = ilanguageRepository.findAll();
        return language;
    }

    @Override
    public void saveLanguage(Language language) {
        ilanguageRepository.save(language);

    }

    @Override
    public void deleteLanguage(Long id) {
        ilanguageRepository.deleteById(id);

    }

    @Override
    public Language findLanguage(Long id) {
        Language language = ilanguageRepository.findById(id).orElse(null);
        return language;
    }
}
