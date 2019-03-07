package com.sly.demo.importpic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.sly.demo.**.mapper")
public class DemoImportpicApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoImportpicApplication.class, args);
	}

}
