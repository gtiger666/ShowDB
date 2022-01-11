package cn.cocowwy.showdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories
public class ShowDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShowDbApplication.class, args);
    }

}
