package com.animais.apirestanimais.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.common.base.Predicate;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerConfig {

	 @Bean
	  public Docket api() {
	    return new Docket(DocumentationType.SWAGGER_2)
	        .select()
	        .apis(RequestHandlerSelectors.any())
	        .paths(PathSelectors.ant("/api-animais/**"))
	        .build()
	        .useDefaultResponseMessages(false)
	        .globalResponseMessage(RequestMethod.GET, responseMessageForGET())
	        .apiInfo(buildApiInfo());
	  }

	  private ApiInfo buildApiInfo() {
	    return new ApiInfo(
	    		"Animais Ameaçados de Extinção e já Extintos API REST",
				"API REST de leitura e cadastro de informações de animais ameaçados de extinção e já extintos",
				"1.0",
				"terms of Service",
				new Contact("Eduardo Rodrigues Santana (https://github.com/eRodriguesSantana)", "https://www.linkedin.com/in/eduardo-rodrigues-santana/",
						"eduardo.r.santana@hotmail.com"),
				"Apache License Version 2.0",
				"https://www.apache.org/licenses/LICENSE-2.0",                                                            // URL de licensa
	      Collections.emptyList()                                                             // Extensão de fornecedores
	    );
	  }
	  
	  private List<ResponseMessage> responseMessageForGET()
	  {
	      return new ArrayList<ResponseMessage>() {{
	          add(new ResponseMessageBuilder()
	              .code(500)
	              .message("500 message")
	              .responseModel(new ModelRef("Error"))
	              .build());
	          add(new ResponseMessageBuilder()
	              .code(403)
	              .message("Forbidden!")
	              .build());
	      }};
	  }
	
}