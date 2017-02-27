package com.ebanker.service.impl;

import com.ebanker.domain.EbankerUser;
import com.ebanker.domain.EbankerUserRoles;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ebanker.dao.EbankerUserDao;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private EbankerUserDao userDao;

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {

        EbankerUser ebankerUser = getUserDao().findUserByUsername(username);
        List<GrantedAuthority> authoritys = buildUserAuthority(ebankerUser.getEbankerUserRolesSet());
        User user = new User(ebankerUser.getUserUsername(), ebankerUser.getUserPassword(), authoritys);
        return user;
    }

    private List<GrantedAuthority> buildUserAuthority(Set<EbankerUserRoles> userRoles) {
        List<GrantedAuthority> setAuthorities = new ArrayList<>();
        for (EbankerUserRoles userRole : userRoles) {
            setAuthorities.add(new SimpleGrantedAuthority(userRole.getUserRolesRoleName()));
        }
        return setAuthorities;
    }

    public EbankerUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(EbankerUserDao userDao) {
        this.userDao = userDao;
    }

}
