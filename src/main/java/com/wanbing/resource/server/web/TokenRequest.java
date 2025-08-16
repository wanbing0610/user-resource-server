package com.wanbing.resource.server.web;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TokenRequest {
    private String grant_type;
    private String code;
    private String redirect_uri;
}
