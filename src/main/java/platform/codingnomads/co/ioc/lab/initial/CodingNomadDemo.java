package platform.codingnomads.co.ioc.lab.initial;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import platform.codingnomads.co.springdata.example.ddl.onetoone.bidirectional.Application;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CodingNomadDemo {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
                CodingNomadsConfiguration.class
        );
        CodingNomad codingNomad = ctx.getBean(CodingNomad.class);
        System.out.println(codingNomad.createAwesomeSoftware());
    }
}
