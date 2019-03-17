package com.kruzer.rma.services;



import com.kruzer.rma.Model.Users;
import com.kruzer.rma.Repository.UserAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserAppServices {

    UserAppRepository userAppRepository;
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserAppServices(UserAppRepository userAppRepository) {
        this.userAppRepository = userAppRepository;
     //   this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    // mikroserwis do zapisu użytkownika do DB
    public boolean registerUser(Users users){
        try {
            users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
            System.out.println("PASSWORD = " + bCryptPasswordEncoder.encode(users.getPassword()));
            userAppRepository.save(users);
      //      userAppRepository.save(users);
            return true;
        } catch(NullPointerException ex){
            ex.printStackTrace();
        }
        return false;
    }

    public Boolean checkUserLogin(Users users) {
        try {
            Users user = userAppRepository.findFirstByName(users.getName());
            String passencoded;
            passencoded = userAppRepository.findFirstByName(users.getName()).getPassword();

            System.out.println("--------");
            System.out.println(users.toString());
            System.out.println(user.toString());
            System.out.println("--------");
            System.out.println("web:  " + users.getPassword() + " " + bCryptPasswordEncoder.encode(users.getPassword()));
            System.out.println("baza: " + user.getPassword() + " " + user.getPassword());
            System.out.println("--------");
            if(passencoded.equals(bCryptPasswordEncoder.encode(users.getPassword()))){
                System.out.println("DOBRE HASLO");
                return true;
            }

        } catch(NullPointerException ex){
            ex.printStackTrace();
        }
        System.out.println("ZLE HASLO");
        return false;
    }
}
