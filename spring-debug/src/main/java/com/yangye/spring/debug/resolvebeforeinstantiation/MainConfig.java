package com.yangye.spring.debug.resolvebeforeinstantiation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
// 开启aop代理
@EnableAspectJAutoProxy
public class MainConfig {
}
