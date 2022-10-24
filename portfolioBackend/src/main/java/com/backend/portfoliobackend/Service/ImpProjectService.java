package com.backend.portfoliobackend.Service;

import com.backend.portfoliobackend.Entity.Project;
import com.backend.portfoliobackend.Interface.IProjectService;

import com.backend.portfoliobackend.Repository.IProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ImpProjectService implements IProjectService {


    @Autowired
    IProjectRepository iprojectRepository;

    @Override
    public List<Project> getProject() {
        List<Project> project = iprojectRepository.findAll();
        return project;
    }

    @Override
    public void saveProject(Project project) {
        iprojectRepository.save(project);

    }

    @Override
    public void deleteProject(Long id) {
        iprojectRepository.deleteById(id);

    }

    @Override
    public Project findProject(Long id) {
        Project project = iprojectRepository.findById(id).orElse(null);
        return project;
    }
}
