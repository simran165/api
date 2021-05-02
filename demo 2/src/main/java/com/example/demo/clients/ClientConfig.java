package com.example.demo.clients;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClientConfig {

    @Bean
    CommandLineRunner commandLineRunner (ClientRepository repository){
        return args -> {
            client joe_john = new client(

                    "joe john",
                    "joe@joe.com",
                    "123 street",
                    323999.34
            );
            client john = new client(

                    "john joe",
                    "john@google.com",
                    "321 street",
                    1234353.54
            );
            repository.saveAll(
                    List.of(joe_john,john)
            );
        };
    }

}
