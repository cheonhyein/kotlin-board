import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("org.springframework.boot") version "2.4.5"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id ("org.jetbrains.kotlin.plugin.spring") version "1.7.10"
}

group = "me.clouderp"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.microutils:kotlin-logging:1.12.5") // logging
    implementation("org.jetbrains.kotlin:kotlin-reflect")
//    이 라이브러리는 kotlin에서 필수적인 기능들을 제공해줍니다.
//    let, apply, use, synchronized 등의 함수
//    collection의 이용에 도움이되는 확장 함수
//    문자열을 다루는 다양한 유틸들
//    IO와 threading 관련 함수들
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}