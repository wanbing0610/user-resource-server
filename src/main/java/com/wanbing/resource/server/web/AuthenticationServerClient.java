package com.wanbing.resource.server.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "authenticationClient", url = "http://localhost:9000", configuration = BasicAuthConfig.class)
public interface AuthenticationServerClient {

    @PostMapping(value = "oauth2/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String getJwtByCode(@RequestBody MultiValueMap<String, String> formData);
}
