package br.com.fiap.andromeda.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.andromeda.dao.UsuarioDAO;
import br.com.fiap.andromeda.entity.Usuario;

public class UsuarioTeste {

	public static void main(String[] args) {
		EntityManager em = null;
		try {
			em = Persistence.createEntityManagerFactory("andromeda").createEntityManager();
			Usuario usuario = new Usuario("Bruna Macieiro", 0, "test@email.com", "teste");
			
			UsuarioDAO dao = new UsuarioDAO(em);
			dao.inserir(usuario);
			dao.commit();
			
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		} finally{
			if(em != null) {
				em.close();
			}
		}
		System.exit(0);
	}

}
