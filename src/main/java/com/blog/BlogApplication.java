package com.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 注意SpringBoot项目部署需要extends SpringBootServletInitializer，重写configure(),....return builder.sources(this.getClass())
 */
@SpringBootApplication
@MapperScan("com.blog.mapper")
public class BlogApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@Override//为了打包springboot项目
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}
}

