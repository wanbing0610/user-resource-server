package com.wanbing.resource.server.web;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class testController {

    @PostMapping(value = "oauth2/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String getJwtByCode(@SpringQueryMap TokenRequest tokenRequest, HttpServletRequest request) {
        log.info(request.getParameterMap().toString());
        return "ok";
    }


}
