package com.zhmohamed.healthtrackerbackend;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class AppUser {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public long id;
    @Column(unique = true)
    public String username;
    public String password;

    @OneToMany(mappedBy="appUser")
    public List<Exercise> exercises;

    public AppUser(){}

    public AppUser (String username, String password){
        this.username = username;
        this.password= password;
    }
    public String toString (){
        return username;
    }

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }

//    @Override
//    public String getPassword() {
//        return this.password;
//    }
//
//    @Override
//    public String getUsername() {
//        return this.username;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true ;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }

}
