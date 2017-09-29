package com.idreamon.mymoney.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages={"com.idreamon.mymoney.web"})
@EnableOAuth2Sso
public class Application extends SpringBootServletInitializer {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
