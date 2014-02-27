# Spring AOP 샘플

=====================================

각 예제는 Pro Spring 2.5 서적의 내용을 참고하여 작성 되었습니다.

* *nix 기준으로 진행
```
gradle wrapper
./gradlew check
./gradlew initProject
```

* eclipse 를 사용하는 경우
```
./gradlew eclipse
```
다음으로 IDE 에서 프로젝트를 import 함



패키지별 소스 내용입니다.

* aop.base : AOP 적용을 할 Target 객체들이 위치

* aop.proxy : Spring의 ProxyFactory 를 이용한 AOP 적용

* aop.classic : 1.x 버전 Classic AOP

* aop.schema : AOP Namespace 를 이용한 xml 설정

* aop.annotation : Annotation 기반의 AOP 구현 부분

* aop.javaconfig : Java Based Config 부분

* aop.prospring : Pro Spring 2.5 예제 부분

