package it.project.database;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class JpaEntityManager {

	private static EntityManagerFactory factory;
	
	
	private JpaEntityManager() {} // makes constructor unaccessible
	
	@Bean(name = "entityManagerFactory")
	public static EntityManagerFactory getInstance() {
		if(factory == null) {
			factory = Persistence.createEntityManagerFactory("OortActivity");
			System.out.println("Entity manager factory created.");
		}
		return factory;
	}

}
