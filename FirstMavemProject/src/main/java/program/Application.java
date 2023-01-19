package program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.person;

public class Application {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		person p1 = new person(1,"carlos da silva", "carlos@gmail.com");

		em.getTransaction().begin();
		em.merge(p1); // use merge instead of persist
		em.getTransaction().commit();

		System.out.println("Person saved to the database: " + p1);


	}

}
