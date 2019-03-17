package com.kruzer.rma.services;


import com.kruzer.rma.Model.Users;
import com.kruzer.rma.Repository.UserAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAppServices {

    UserAppRepository userAppRepository;

    @Autowired
    public UserAppServices(UserAppRepository userAppRepository) {
        this.userAppRepository = userAppRepository;
    }

    // mikroserwis do zapisu użytkownika do DB
    public boolean registerUser(Users users){
        try {
            userAppRepository.save(users);
      //      userAppRepository.save(users);
            return true;
        } catch(NullPointerException ex){
            ex.printStackTrace();
        }
        return false;
    }
}
