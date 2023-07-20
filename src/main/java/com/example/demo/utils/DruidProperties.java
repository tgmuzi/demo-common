package com.example.demo.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.druid")
@Data
public class DruidProperties {
    private String resetEnable;
    private String loginUsername;
    private String loginPassword;
    private String allow;
}