package com.viktor.service.impl;


import com.viktor.model.User;
import com.viktor.service.UserService;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private SessionFactory sessionFactory;

    public UserServiceImpl() {
    }

    @Transactional
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Query query = sessionFactory.getCurrentSession().createQuery("from User u where u.username=:username");
        query.setParameter("username", s);
        User result = (User) query.uniqueResult();
        if (result == null) throw new UsernameNotFoundException("username: " + s + " not found");
        return result;
    }
}
