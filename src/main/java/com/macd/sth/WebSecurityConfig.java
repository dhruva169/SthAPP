package com.macd.sth;

import com.macd.sth.dao.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.authentication.AuthenticationManager;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//        auth.inMemoryAuthentication()
//                .withUser("user").password("{noop}password").roles("user")
//                .and()
//                .withUser("admin").password("{noop}password").roles("user", "admin");
//    }

    @Bean
    public AuthenticationManager customAuthenticationManager() throws Exception {
        return authenticationManager();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                                .csrf().disable()
                                .authorizeRequests()
                                .antMatchers("/bankDeposits/**", "/customer/**","/delivery/**","/inventory/**","/location/**","/orders/**", "/supplier/**", "/todo/**", "/tyre/**", "/vehicle/**").hasAnyAuthority("employee","admin")
                                .antMatchers("/employee/**").hasAnyAuthority("admin")
                                .antMatchers("/", "/login", "/logout").permitAll()





                                .anyRequest().authenticated()

//        http.authorizeRequests().antMatchers("/shop", "/shop/**").access("hasAuthority('')");

//        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

        .and().formLogin()
                .successForwardUrl("/home")
                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/");
    }
}