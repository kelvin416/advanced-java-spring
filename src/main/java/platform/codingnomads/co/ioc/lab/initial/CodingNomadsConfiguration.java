package platform.codingnomads.co.ioc.lab.initial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CodingNomadsConfiguration {

    @Bean
    public Framework framework(){
        return Framework.builder().name("Spring Boot").version("2.5").build();
    }

    @Bean
    public IDE ide(){
        return IDE.builder().name("Intellij IDE").version("2021.1").build();
    }

    @Bean
    public JDK jdk(){
        return JDK.builder().name("Open JDK").version("11").build();
    }
}
