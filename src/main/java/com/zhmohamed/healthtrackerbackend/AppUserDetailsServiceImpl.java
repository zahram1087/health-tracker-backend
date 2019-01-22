package com.zhmohamed.healthtrackerbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private AppUserRepository appUserRepo;

    @Override
    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException
    {
        AppUser appUser = this.appUserRepo.findByUsername(username);

        if(appUser == null){
            System.out.println("User Not Found!" + username);
            throw  new UsernameNotFoundException(("User " + username+ "was not found in the batabase");
        }


        System.out.println("Found user: " + appUser);

        return (UserDetails) appUser;
    }
}

