package com.example.oauth2.security;

import com.example.oauth2.model.User;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by thebloez on 26/11/18.
 */
public class UserPrincipal {
    private long id;

    public static UserDetails create(User user) {
        return null;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
