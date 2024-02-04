package com.lesson.bank;

import com.lesson.bank.client.ClientGet;
import com.lesson.bank.client.ClientSend;
import com.lesson.bank.client.UserClient;
import com.lesson.bank.repositories.ClientRepository;
import com.lesson.bank.services.ClientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.io.IOException;

@Configuration
@ComponentScan("com.lesson.bank")
public class SpringConfig {

    /*@Bean
    public RegistrationScreen registrationScreen(){
        return new RegistrationScreen();
    }

    @Bean
    @Lazy
    public UserClient userClient(){
        return new UserClient(registrationScreen().getRegistrationScreenController());
    }

    @Bean
    public ClientSend clientSend(){
        return new ClientSend();
    }

    @Bean
    @Lazy
    MainScreen mainScreen() throws IOException {
        return new MainScreen(userClient(), clientSend(), clientGet());
    }

    @Bean
    @Lazy
    public ClientGet clientGet() throws IOException {
        return new ClientGet(clientSend(), mainScreen().getMainScreenController());
    }

    @Bean
    public ClientRepository clientRepository(){
        return new ClientRepository();
    }

    @Bean
    @Lazy
    public ClientService clientService(){
        return new ClientService()
    }*/

}
