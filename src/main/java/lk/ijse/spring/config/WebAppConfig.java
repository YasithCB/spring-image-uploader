package lk.ijse.spring.config;

import lk.ijse.spring.advice.AppWideExceptionHandler;
import lk.ijse.spring.controller.ImageController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * author  Yasith C Bandara
 * created 2/7/2023 - 2:01 PM
 * project spring-image-uploader
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {ImageController.class/*,AppWideExceptionHandler.class*/})
public class WebAppConfig {
}
