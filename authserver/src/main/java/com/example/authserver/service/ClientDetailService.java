package com.example.authserver.service;

import com.example.authserver.domain.SecurityClient;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class ClientDetailService implements org.springframework.security.oauth2.provider.ClientDetailsService {
    @Override
    public ClientDetails loadClientByClientId(String s) throws ClientRegistrationException {
        SecurityClient securityClient=new SecurityClient();
        securityClient.setClientId("android");
        securityClient.setClientSecret("android");
        securityClient.setAuthorizedGrantTypes(Arrays.asList("password"));
        securityClient.setScope(Arrays.asList("read"));
        return securityClient;
    }
}
