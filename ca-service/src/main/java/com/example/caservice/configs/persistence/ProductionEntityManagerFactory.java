package com.example.caservice.configs.persistence;

import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

public class ProductionEntityManagerFactory extends LocalContainerEntityManagerFactoryBean {
    public ProductionEntityManagerFactory() {
        super();
    }
}
