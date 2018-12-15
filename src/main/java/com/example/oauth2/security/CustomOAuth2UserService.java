package com.example.oauth2.security;

import com.example.oauth2.exception.OAuth2AuthenticationProcessingException;
import com.example.oauth2.model.AuthProvider;
import com.example.oauth2.model.User;
import com.example.oauth2.repository.UserRepository;
import com.example.oauth2.security.oauth2.user.OAuth2UserInfo;
import com.example.oauth2.security.oauth2.user.OAuth2UserInfoFactory;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

/**
 * Created by thebloez on 26/11/18.
 */
/*
* The CustomOAuth2UserService extends Spring Security’s DefaultOAuth2UserService and implements its loadUser() method.
* This method is called after an access token is obtained from the OAuth2 provider.
* In this method, we first fetch the user’s details from the OAuth2 provider.
* If a user with the same email already exists in our database then we update his details, otherwise,
* we register a new user.*/
@Service
public class CustomOAuth2UserService extends DefaultOAuth2UserService{

    private UserRepository userRepos;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest oAuth2UserRequest) throws OAuth2AuthenticationException {
        OAuth2User oAuth2User = super.loadUser(oAuth2UserRequest);

        try {
            return processOAuth2User(oAuth2UserRequest, oAuth2User);
        } catch (AuthenticationException ex){
            throw ex;
        } catch (Exception e) {
            // Throwing an instance of AuthenticationException will trigger the OAuth2AuthenticationFailureHandler
            throw new InternalAuthenticationServiceException(e.getMessage(), e.getCause());
        }

    }

    private OAuth2User processOAuth2User(OAuth2UserRequest oAuth2UserRequest, OAuth2User oAuth2User) {
        // to be continued here
        return null;
    }
}
