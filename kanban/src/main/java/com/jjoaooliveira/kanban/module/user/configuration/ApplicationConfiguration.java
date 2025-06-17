package com.jjoaooliveira.kanban.module.user.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jjoaooliveira.kanban.module.user.application.CreateUser;
import com.jjoaooliveira.kanban.module.user.application.ReadUserInformation;
import com.jjoaooliveira.kanban.module.user.application.UserDataGatewayInterface;
import com.jjoaooliveira.kanban.module.user.infrastructure.database.UserDataGateway;
import com.jjoaooliveira.kanban.module.user.infrastructure.database.UserRepository;

@Configuration
public class ApplicationConfiguration {

    @Bean
    CreateUser makeCreateUser(UserDataGatewayInterface userDataGatewayInterface) {
        return new CreateUser(userDataGatewayInterface);
    }

    @Bean
    ReadUserInformation makeReadUser(UserDataGatewayInterface userDataGatewayInterface) {
        return new ReadUserInformation(userDataGatewayInterface);
    }

    @Bean
    UserDataGatewayInterface userDataGatewayInterface(UserRepository repository) {
        return new UserDataGateway(repository);
    }
}
