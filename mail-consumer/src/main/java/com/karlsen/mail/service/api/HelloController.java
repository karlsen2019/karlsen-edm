package com.karlsen.mail.service.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sauyer
 * @date 2019/7/7 15:45
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "hello";
    }
}
