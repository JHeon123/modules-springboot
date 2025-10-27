package com.example.oathSessionTest.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // 1. URL별 접근 권한 설정
                .authorizeHttpRequests(authz -> authz
                        // "/" 경로는 모두 허용
                        .requestMatchers("/").permitAll()
                        // "/mypage" 경로는 "인증된 사용자"(로그인한 사람)만 허용
                        .requestMatchers("/mypage").authenticated()
                        // 나머지 모든 요청은 일단 허용 (필요에 따라 .authenticated() 등으로 변경)
                        .anyRequest().permitAll()
                )
                // 2. OAuth2 로그인 활성화! (이 한 줄이 마법의 시작)
                .oauth2Login(withDefaults()); // 기본 설정 사용

        return http.build();
    }
}
