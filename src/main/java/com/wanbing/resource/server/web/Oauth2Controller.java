package com.wanbing.resource.server.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Oauth2Controller {
    private AuthenticationServerClient authenticationServerClient;

    public Oauth2Controller(AuthenticationServerClient authenticationServerClient) {
        this.authenticationServerClient = authenticationServerClient;
    }

    @GetMapping("login/oauth2/code/oidc-client")
    public String getJWT(@RequestParam("code") String code) {
        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("grant_type", "authorization_code");
        formData.add("code",code);
        formData.add("redirect_uri", "http://127.0.0.1:8080/login/oauth2/code/oidc-client");
        return this.authenticationServerClient.getJwtByCode(formData);
    }
}
