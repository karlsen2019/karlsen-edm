package com.karlsen.mail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * @author sauyer
 * @date 2019/7/7 17:05
 */
@EnableWebMvc
@Configuration
@ComponentScan({"com.karlsen.mail.*"})
@MapperScan(basePackages = "com.bhz.mail.mapper")
public class MainConfig {
}
