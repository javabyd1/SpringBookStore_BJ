package com.mojafirma.springbookshop.interfaces;

import com.mojafirma.springbookshop.model.User;

public interface UserService {

    User findByEmail(String email);
    void createUser(User user);
}
