package com.kimpov;

import com.kimpov.annotation.AnonymousAccess;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Yuqb
 * @date 2021-04-08 0008
 * @version v1.0.0
 */
@EnableAsync
@RestController
@SpringBootApplication
public class Admin {
    public static void main(String[] args) {
        SpringApplication.run(Admin.class, args);
    }

    /**
     * 访问首页提示
     * @return /
     */
    @GetMapping("/")
    @AnonymousAccess
    public String index() {
        return "Backend service started successfully";
    }
}
