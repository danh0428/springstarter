package app;


import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.service.AppService;

@SpringBootApplication
public class App {
    private final static Logger LOGGER = LoggerFactory.getLogger("App");
		
    public static void main(String[] args) throws IOException {
    	ApplicationContext applicationContext = SpringApplication.run(App.class, args);
    	AppService appService = applicationContext.getBean(AppService.class);
    }
}
