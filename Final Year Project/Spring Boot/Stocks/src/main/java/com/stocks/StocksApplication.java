package com.stocks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.cmeza.sdgenerator.annotation.SDGenerator;


//@SDGenerator(
//        entityPackage = "com.stocks.model",
//        repositoryPackage = "com.stocks.repo",
//        repositoryPostfix = "Repository",
//        onlyAnnotations = false,
//        debug = false,
//        overwrite = false
//)
@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.stocks.model"})
public class StocksApplication {

	public static void main(String[] args) {
		SpringApplication.run(StocksApplication.class, args);
	}

}
