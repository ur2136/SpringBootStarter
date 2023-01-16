package com.personal.starter.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {
//	@Bean
//	public DataSource dataSource() {
//		DataSourceBuilder builder = DataSourceBuilder.create();
//		builder.url("jdbc:postgresql://localhost:5432/starter_app");
//		System.out.println("Custom data source bean");
//		return builder.build();
//	}
}
