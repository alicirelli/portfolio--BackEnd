package com.backend.portfoliobackend.Interface;

import com.backend.portfoliobackend.Entity.Project;

import java.util.List;

public interface IProjectService {

    public List<Project> getProject();

    public void saveProject(Project project);

    public void deleteProject(Long id);

    public Project findProject(Long id);

}
