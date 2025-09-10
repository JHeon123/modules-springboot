# Spring Boot Session Auth Module

## 개요
스프링부트를 활용한 세션 기반 사용자 인증 및 회원가입 모듈입니다. <br> 
이메일과 비밀번호를 사용한 회원가입, 로그인, 로그아웃 기능을 제공합니다.

## 주요 기능
- 회원가입
- 세션 기반 로그인/로그아웃
- 세션 시간 연장
- 인터셉터를 통한 로그인 여부(세션 유무) 검사
- 비밀번호 암호화 (BCrypt)

## 주요 엔드포인트
- **POST /signup**: 회원가입
  - 요청: `{ "email": "user@example.com", "password": "password", "nickname": "nickname" }`
- **POST /login**: 로그인
  - 요청: `{ "email": "user@example.com", "password": "password" }`
- **GET /logout**: 로그아웃
  - 요청: `HttpServletRequest request`
- **GET /me**: 세션 유무 체크
  - 요청: `HttpServletRequest request`
- **GET /ping**: 세션 시간 연장(30분으로 초기화)
  - 요청: `HttpServletRequest request`
 
## 시연 영상
[![세션기반인증 모듈 시연영상](http://googleusercontent.com/youtube.com/7)](https://youtu.be/-97frAKdbbw)
https://youtu.be/-97frAKdbbw
