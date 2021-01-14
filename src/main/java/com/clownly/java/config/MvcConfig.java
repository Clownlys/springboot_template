package com.clownly.java.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author clownly
 * @create 2021-01-14 14:41
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * 跨域映射配置
     * time: 2021-01-14 14:44
     * @param corsRegistry
     */
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry){
        corsRegistry.addMapping("/**")
                .allowCredentials(false)
                .allowedHeaders("*")
                .allowedMethods("*")
                .allowedOrigins("*");
    }




}
