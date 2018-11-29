package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Pessoa;

public class Programa {

	public static void main(String[] args) {
		 
		/* OBJETOS
		Pessoa p1 = new Pessoa(null, "Leandro Marques de Oliveira", "lee.marques.96@gmail.com");
		Pessoa p2 = new Pessoa(null, "Aline Almeida", "aline@gmail.com");
		Pessoa p3 = new Pessoa(null, "Matheus Leal", "matheus@gmail.com");
		*/
		
		/* OBJETOS DO JPA */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/* ABRINDO TRANSAÇÃO */
		em.getTransaction().begin();
		
		/* SALVANDO OBJETOS	
	    em.persist(p1);
		em.persist(p2);
		em.persist(p3);*/
				
		/*BUSCANDO OBJETO NA BASE DE DADOS*/
		Pessoa p = em.find(Pessoa.class, 3);		
	
		/*REMOVENDO OBJETO*/
		em.remove(p);
		
		/*System.out.println("Pessoa inserida com sucesso!");*/
		/*FECHANDO A TRANSAÇÃO E COMMITANDO OS DADOS*/
		em.getTransaction().commit();
		
		/*FECHANDO OS ENTITYS*/
		em.close();
		emf.close();
	}

}
