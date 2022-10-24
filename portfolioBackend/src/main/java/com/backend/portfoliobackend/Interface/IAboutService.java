package com.backend.portfoliobackend.Interface;

import com.backend.portfoliobackend.Entity.About;

import java.util.List;

public interface IAboutService {


    public List<About> getAbout();

    public void saveAbout(About about);

    public void deleteAbout(Long id);

    public About findAbout(Long id);

}
