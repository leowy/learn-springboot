package pers.leowy.springboot.sqlite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("pers.leowy.springboot.sqlite.DAO")
@SpringBootApplication
public class SqliteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqliteApplication.class, args);
    }

}
