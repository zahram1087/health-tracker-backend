package com.zhmohamed.healthtrackerbackend;

import org.springframework.data.repository.CrudRepository;

public interface AppUserRepository extends CrudRepository <AppUser,Long> {
    public AppUser findByUsername(String username);
}
