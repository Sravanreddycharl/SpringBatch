package com.test.springbootrestswagger.swagger;

import io.swagger.annotations.ExternalDocs;
import io.swagger.annotations.SwaggerDefinition;

@SwaggerDefinition(
      
        consumes = {"application/json", "application/xml"},
        produces = {"application/json", "application/xml"},
        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS},
        externalDocs = @ExternalDocs(value = "Read This For Sure", url = "http://in28minutes.com")
)
public interface ApiDocumentationConfig {

}