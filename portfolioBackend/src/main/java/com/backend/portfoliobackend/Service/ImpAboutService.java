package com.backend.portfoliobackend.Service;

import com.backend.portfoliobackend.Entity.About;
import com.backend.portfoliobackend.Interface.IAboutService;

import com.backend.portfoliobackend.Repository.IAboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ImpAboutService implements IAboutService {


    @Autowired
    IAboutRepository iaboutRepository;

    @Override
    public List<About> getAbout() {
        List<About> about = iaboutRepository.findAll();
        return about;
    }

    @Override
    public void saveAbout(About about) {
        iaboutRepository.save(about);

    }

    @Override
    public void deleteAbout(Long id) {
        iaboutRepository.deleteById(id);

    }

    @Override
    public About findAbout(Long id) {
        About about = iaboutRepository.findById(id).orElse(null);
        return about;
    }
}
