package com.macd.sth.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.macd.sth.models.employee;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    EmployeeDao employeeDao;


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        employee employee = employeeDao.findByUsername(userName);

        List<GrantedAuthority> grantList = new ArrayList<>();
        GrantedAuthority authority = new SimpleGrantedAuthority(employee.getDesignation());
//        System.out.println(employee.getDesignation().getClass());
        grantList.add(authority);

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
//                user.getEmail_id(), user.getPassword(), grantList;
                employee.getUsername(), employee.getPassword(), grantList   );

        return userDetails;



    }
}
