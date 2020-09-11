# Spring Webservice 2

본 프로젝트는 스프링 부트를 통한 웹서비스 개발을 학습하는 목적으로 진행하였습니다. 기본적인 CRUD를 작성하고 스프링 시큐리티를 활용하여 소셜 로그인을 다룹니다.
JUnit4를 이용해 단위테스트를 진행하고 AWS이용해 무중단 배포 환경을 학습합니다.

"스프링 부트와 AWS로 혼자 구현하는 웹서비스"책을 참고해서 프로젝트를 진행했습니다.



## 프로젝트 환경 
  * 웹 어플리케이션
    - Spring boot : 2.1.9
    - Gradle : 4.10.2
    - JPA
    - H2 데이터 베이스

  * 배포 환경
    - EC2
    - RDS (Maria DB)
    - S3
    - travis CI
    - CodeDeploy



## 프로젝트 기능

```
게시판 작성을 통해 글을 쓸 수 있도록 합니다.
스프링 시큐리티 OAuth2를 이용해 로그인 기능을 구현 합니다 (Naver, Google API 사용)

```

## 배포 과정
![image](https://user-images.githubusercontent.com/37431938/92869337-b3814f80-f43d-11ea-9e97-4cae6fcd96fc.png)




## 구현 화면
 - 메인화면
![image](https://user-images.githubusercontent.com/37431938/92870919-52f31200-f43f-11ea-8138-956b9222ceb6.png)

- 글 작성
![image](https://user-images.githubusercontent.com/37431938/92870503-e5df7c80-f43e-11ea-906e-877b5c226f5f.png)



