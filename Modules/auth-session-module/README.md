# 세션 기반 로그인/회원가입 모듈

## 현재 문제점
- 로그아웃할 때 브라우저의 세션아이디가 갱신되지 않는다. 
- 로그인 안하고 session.html로 가면 서버에 세션관련 요청을해서
  브라우저의 세션아이디가 갱신되는데, 로그인하면 이 세션아이디가 유지된다.

## 해결방안
- 로그인할때 브라우저의 세션아이디와 상관없이 무조건 세션을 새롭게 만든다.
- 로그아웃할때 리다이렉트해서 서버가 새롭게 세션을 만들어고 전달해서 브라우저의 세션아이디를 갱신해준다.

## 주요 기능
- 로그인, 로그아웃
- 회원가입
- 세션 유무 체크, 세션 기간 연장

## 시연 영상 링크
- https://youtu.be/-97frAKdbbw

## 엔드포인트

#### 회원가입
- **POST** `/api/signup`  
  - Request Body: `SignupRequestDto`
  - Response:  
    ```json
    {
      "success": true,
      "data": "회원가입 성공"
    }
    ```



#### 로그인
- **POST** `/api/login`  
  - Request Body: `LoginRequestDto`
  - Response:  
    ```json
    {
      "success": true,
      "data": "로그인 성공"
    }
    ```



#### 로그아웃
- **POST** `/api/logout`   
  - Response:  
    ```json
    {
      "success": true,
      "data": "로그아웃 성공"
    }
    ```



#### 내 정보 확인
- **GET** `/api/me`  
  - Response:  
    ```json
    {
      "success": true,
      "data": {
        "id": 1,
        "username": "exampleUser",
        ...
      }
    }
    ```



#### 세션 연장 (ping)
- **GET** `/api/ping`  
  - Response:  
    ```json
    {
      "success": true,
      "data": "OK"
    }
    ```
