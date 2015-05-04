package com.viktor.dao.impl;

import com.viktor.dao.ProjectDao;
import com.viktor.model.Project;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ProjectDaoImpl implements ProjectDao{

    @Autowired
    private SessionFactory sessionFactory;

    public ProjectDaoImpl() {
    }

    public ProjectDaoImpl(SessionFactory sessionFactory) {
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Project> projectList() {

        return sessionFactory.getCurrentSession().createQuery("from Project").list(); // from Project - Project подчеркнуто красным
    }


}
