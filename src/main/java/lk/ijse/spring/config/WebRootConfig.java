package lk.ijse.spring.config;

import lk.ijse.spring.service.ImageDataService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * author  Yasith C Bandara
 * created 2/7/2023 - 2:02 PM
 * project spring-image-uploader
 */

@Configuration
@Import({JPAConfig.class})
@ComponentScan(basePackageClasses = {ImageDataService.class})
public class WebRootConfig {
}
