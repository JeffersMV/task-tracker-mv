package com.viktor.model;

import com.viktor.model.common.Model;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "user")
public class User extends Model implements UserDetails, Serializable {


    private static final long serialVersionUID = -3877178451972960728L;
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "userDo")
    private List<Task> taskListDo;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<RoleList> roleLists = new HashSet<RoleList>();

    public User() {
    }

    public User(long id) {
        super(id);
    }

    public User(long id, String username, String password, List<Task> taskListDo, Set<RoleList> roleLists) {
        super(id);
        this.username = username;
        this.password = password;
        this.taskListDo = taskListDo;
        this.roleLists = roleLists;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> result = new ArrayList<SimpleGrantedAuthority>();
        for (RoleList roleList : roleLists) {
            result.add(new SimpleGrantedAuthority(roleList.getRole().name()));
        }
        return result;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Task> getTaskListDo() {
        return taskListDo;
    }

    public void setTaskListDo(List<Task> taskListDo) {
        this.taskListDo = taskListDo;
    }

    public Set<RoleList> getRoleLists() {
        return roleLists;
    }

    public void setRoleLists(Set<RoleList> roleLists) {
        this.roleLists = roleLists;
    }
}
