package com.viktor.service.impl;

import com.viktor.dao.ProjectDao;
import com.viktor.model.Project;
import com.viktor.service.ProjectService;
import org.hibernate.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDao projectDao;

    public ProjectServiceImpl() {
    }

    public ProjectServiceImpl(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    @Transactional
    public List<Project> projectList() {
        return projectDao.projectList();
    }
}
