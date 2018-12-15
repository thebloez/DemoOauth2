package com.example.oauth2.exception;

/**
 * Created by thebloez on 26/11/18.
 */
public class OAuth2AuthenticationProcessingException extends Throwable {
    public OAuth2AuthenticationProcessingException(String msg, Throwable t) {
        super(msg, t);
    }

    public OAuth2AuthenticationProcessingException(String msg) {
        super(msg);
    }
}
