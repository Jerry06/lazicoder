//package com.lazi.coder;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class SpringSecurityWebAppConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.antMatcher("/**")
//            .authorizeRequests()
//            .antMatchers("/", "/login**", "/webjars/**", "/index.html")
//            .permitAll()
//            .anyRequest()
//            .authenticated();
//    }
//}