package com.example.oathSessionTest.Controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // 1. 공용 페이지 (로그인 안 해도 접근 가능)
    @GetMapping("/")
    public String home() {
        return "home"; // home.html 템플릿 반환
    }

    // 2. 개인화 페이지 (로그인 해야만 접근 가능 - SecurityConfig에서 막음)
    @GetMapping("/mypage")
    public String myPage(Model model, @AuthenticationPrincipal OAuth2User oauth2User) {

        // @AuthenticationPrincipal: 시큐리티 '세션'에 저장된 인증 객체를 가져옴
        // OAuth2User: OAuth2로 로그인한 사용자의 정보를 담고 있음

        // 구글에서 받은 사용자 정보 확인
        String name = oauth2User.getAttribute("name");
        String email = oauth2User.getAttribute("email");

        model.addAttribute("name", name);
        model.addAttribute("email", email);

        return "mypage"; // mypage.html 템플릿 반환
    }
}
