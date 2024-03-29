package org.sid.security.jwt;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JWTAuthorizationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("***********************");
        /*

         */
        String jwt = request.getHeader("Authorization");
        if(jwt==null) throw new RuntimeException("Not Authorized -> Token");
        /*

         */
        filterChain.doFilter(request, response);
    }
}
