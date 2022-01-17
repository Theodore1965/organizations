package com.neusoft.appointment.organizations;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@MapperScan(value = {"com.neusoft.appointment.organizations.dao", "com.neusoft.mybatis.expand.dao"})
public class OrganizationsApplication {

    static Logger logger= LoggerFactory.getLogger(OrganizationsApplication.class);

    public static void main(String[] args) throws UnknownHostException {

        ConfigurableApplicationContext application=SpringApplication.run(OrganizationsApplication.class, args);
        Environment env = application.getEnvironment();

        String host= InetAddress.getLocalHost().getHostAddress();
        String port=env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");
        logger.info("\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running! Access URLs:\n\t" +
                        "Local: \t\thttp://localhost:{}\n\t" +
                        "External: \thttp://{}:{}\n\t"+
                        "Doc: \thttp://{}:{}/doc.html\n\t"+
                        "Druid monitor: \thttp://{}:{}/druid\n\t" +
                        "----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                env.getProperty("server.port"),
                host,port,
                host,port,
                host,port);
    }

}
