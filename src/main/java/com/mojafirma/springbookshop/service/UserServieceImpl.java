package com.mojafirma.springbookshop.service;

import com.mojafirma.springbookshop.interfaces.UserService;
import com.mojafirma.springbookshop.model.Roles;
import com.mojafirma.springbookshop.model.User;
import com.mojafirma.springbookshop.repository.RoleRepository;
import com.mojafirma.springbookshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class UserServieceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public void createUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(
                user.getPassword()
        ));
        user.setActive(1);
        Roles userRole = roleRepository.findByRole("ADMIN");
        user.setRoleSet(new HashSet<>(Arrays.asList(userRole)));
        userRepository.save(user);
    }
}
