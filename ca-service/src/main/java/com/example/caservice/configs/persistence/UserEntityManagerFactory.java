package com.example.caservice.configs.persistence;

import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

public class UserEntityManagerFactory extends LocalContainerEntityManagerFactoryBean {
    public UserEntityManagerFactory() {
        super();
    }
}
