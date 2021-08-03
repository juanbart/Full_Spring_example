package com.springboot.gft.clientes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;



@Configuration
@EnableSwagger2
public class SpringFoxConfig   {
	
	
	  @Bean
      public Docket api() {
                  return new Docket(DocumentationType.SWAGGER_2)
                              .select()
                              .apis(RequestHandlerSelectors.basePackage("com.springboot.gft.clientes"))
                              .paths(PathSelectors.any())
                              .build();
          }

	
}