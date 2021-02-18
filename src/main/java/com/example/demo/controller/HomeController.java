package com.example.demo.controller;

import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.keycloak.representations.AccessToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {


    @GetMapping("/admin-home")
    public String getAdminHome(){
        return "USER role - Home Page";
    }


    @GetMapping("/user-home")
    public String getUserHome(){
        return "USER role - Home Page";
    }


    @GetMapping("/credential")
    public AccessToken getCredential(Principal principal){
        KeycloakAuthenticationToken keycloakAuthenticationToken = (KeycloakAuthenticationToken) principal;
        return keycloakAuthenticationToken.getAccount().getKeycloakSecurityContext().getToken();
    }

}
