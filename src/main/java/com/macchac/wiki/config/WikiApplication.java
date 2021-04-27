package com.macchac.wiki.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@ComponentScan("com.macchac.wiki")
@SpringBootApplication
public class WikiApplication {

    private static final Logger logger = LoggerFactory.getLogger(WikiApplication.class);
    
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WikiApplication.class);
        Environment env = app.run(args).getEnvironment();
        logger.info("启动成功！");
        logger.info("地址：\t http://127.0.0.1:{}",env.getProperty("server.port"));
    }

}
