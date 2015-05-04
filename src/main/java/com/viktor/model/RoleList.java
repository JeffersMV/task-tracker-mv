package com.viktor.model;

import com.viktor.model.User;
import com.viktor.model.common.Model;
import com.viktor.model.common.Role;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "role_list")
public class RoleList extends Model implements Serializable {


    private static final long serialVersionUID = -4845322753095294194L;
    @ManyToMany(mappedBy = "roleLists")
    private Set<User> usersSet = new HashSet<User>();

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    public RoleList(){
    }

    public RoleList(long id) {
        super(id);
    }

    public RoleList(long id, Role role) {
        super(id);
        this.role = role;
    }


    public Set<User> getUsersSet() {
        return usersSet;
    }

    public void setUsersSet(Set<User> usersSet) {
        this.usersSet = usersSet;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
