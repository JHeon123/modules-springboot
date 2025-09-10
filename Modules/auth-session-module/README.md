# 세션 기반 로그인/회원가입 모듈

## 주요 기능
- 로그인, 로그아웃
- 회원가입
- 세션 유무 체크, 세션 기간 연장

## 시연 영상 링크
https://youtu.be/-97frAKdbbw

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
