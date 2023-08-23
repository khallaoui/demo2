package com.domaine.exemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.domaine.exemple.metier.ArticleService;

@SpringBootApplication
public class PremierExempleApplication {

	public static void main(String[] args) {
		ApplicationContext context =
					SpringApplication.run(PremierExempleApplication.class, args);
		// acceder au beau ArticleService pour lancer init
		ArticleService service = context.getBean(ArticleService.class);
		service.init();
	}

}
