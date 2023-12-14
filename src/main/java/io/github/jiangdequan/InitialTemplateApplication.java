package io.github.jiangdequan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = {"io.github.jiangdequan.infrastructure.repository.mapper"})
public class InitialTemplateApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(InitialTemplateApplication.class).run(args);
    }

}
