package program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.person;

public class Application {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		person p = em.find(person.class, 1);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		em.close();
		emf.close();


	}

}
