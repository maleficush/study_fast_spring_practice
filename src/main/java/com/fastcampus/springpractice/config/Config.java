package com.fastcampus.springpractice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 해당 패키지 아래에 있는 빈들을 등록하는 annotation
@ComponentScan("com.fastcampus.springpractice")
// 스프링 전용 config
@Configuration
public class Config {

}
