package com.example.service;

import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author Lex
 */
public interface AuthorizeService extends UserDetailsService {
    boolean sendValidateEmail(String email, String sessionId);
}
