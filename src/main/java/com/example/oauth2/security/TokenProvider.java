package com.example.oauth2.security;

import com.example.oauth2.config.AppProperties;
import io.jsonwebtoken.Jwts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by thebloez on 27/11/18.
 */
@Service
public class TokenProvider {
    private static final Logger LOGGER = LoggerFactory.getLogger(TokenProvider.class);

    private AppProperties appProperties;

    public TokenProvider(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    public String createToken(Authentication authentication) {
        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
        Date now = new Date();

        Date expiryDate = new Date(now.getTime() + appProperties.getAuth().getTokenExpirationMsec());

        // code stop untilll here.. lets start soon....
        return null;
    }
}
