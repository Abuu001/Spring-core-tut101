package org.lugonzo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.lugonzo")
@PropertySource("learnerBeanInfo.properties")
public class LearnerConfig {


}
