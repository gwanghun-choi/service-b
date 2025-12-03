# Java 17이 설치된 가벼운 리눅스 이미지 사용
FROM eclipse-temurin:17-jdk-alpine

# 컨테이너 안에서 작업할 디렉터리
WORKDIR /app

# Gradle로 빌드된 JAR 파일을 컨테이너로 복사
COPY build/libs/*.jar app.jar

# 이 컨테이너가 사용할 포트
EXPOSE 8082

# 컨테이너가 시작될 때 실행할 명령
ENTRYPOINT ["java","-jar","app.jar"]