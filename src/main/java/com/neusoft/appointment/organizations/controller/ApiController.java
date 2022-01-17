package com.neusoft.appointment.organizations.controller;

import com.neusoft.mybatis.expand.jwt.TokenProvider;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yufeng
 * @since 2021-07-27 09:26:02
 */
@RestController
@RequestMapping(value = "/api", produces = "application/json; charset=utf-8")
@Api(value = "/api", tags = "服务管理")
@Validated
public class ApiController {

    @Autowired
    private TokenProvider tokenProvider;

    @Autowired
    private AuthenticationManagerBuilder authenticationManagerBuilder;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping(value = "/token", produces = "application/json; charset=UTF-8")
    @ApiOperation(value = "获取token")
    public String getToken(@RequestParam("username") String username, @RequestParam("password") String password) {
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(username, password);

        String encodePassword = passwordEncoder.encode(password);
        boolean flag = passwordEncoder.matches(password, "$2a$10$/PHO1UN9TpsVns.H66hXvOD6B1OVEVpnuR9fRmYmydMtD3/ED6Q46");

        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = tokenProvider.createToken(authentication, true);
        return jwt;
    }
}