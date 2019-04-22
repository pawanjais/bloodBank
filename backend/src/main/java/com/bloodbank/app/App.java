package com.bloodbank.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import com.bloodbank.controller.RepoController;

@EntityScan("com.bloodbank.*")
@EnableJpaRepositories(value="com.bloodbank.repo")
@SpringBootApplication
public class App extends SpringBootServletInitializer{

	public App() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	public RepoController repoController(){
		return new RepoController();
	}
	
	
	
	@Bean
	public UrlBasedViewResolver setUpViewResolver(){
		/*InternalResourceViewResolver resolver = new InternalResourceViewResolver();*/
		UrlBasedViewResolver resolver=new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(App.class, args);

	}

}
