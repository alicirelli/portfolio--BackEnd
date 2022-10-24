package com.backend.portfoliobackend.Interface;

import com.backend.portfoliobackend.Entity.Language;

import java.util.List;

public interface ILanguageService {

    public List<Language> getLanguage();

    public void saveLanguage(Language language);

    public void deleteLanguage(Long id);

    public Language findLanguage(Long id);
}
