package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// instanciando e importando Pessoa
//		Pessoa p1 = new Pessoa(null, "Marcos", "marcos@gmail.com"); // null porque o próprio BD vai implementar um ID para ela
//		Pessoa p2 = new Pessoa(null, "Giovanna", "giovanna@gmail.com");
//		Pessoa p3 = new Pessoa(null, "Maria", "maria@gmail.com"); // já instânciei no Banco de Dados
		
		// instanciar o EntityManagerFactory e EntityManeger 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		// quando o JPA faz uma operação que não é uma simples leitura do BD,
		// ele precisa de uma transação! (Transaction)
		
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
				
		// recuperando um dado Pessoa do BD
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		// removendo um dado
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Operação concluída!");
		
		em.close();
		emf.close();
		

	}

}
