package br.com.fiap.andromeda.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.fiap.andromeda.entity.Usuario;

@Stateless
public class UserService {
	@PersistenceContext
	private EntityManager em;
	
	public Usuario autenticate(String email, String senha) {
		return (Usuario) this.em.createQuery(
							"select u from Usuario u where u.dsEmail = :email and u.dsSenha = :senha"
						 ).setParameter("email", email).setParameter("senha", senha).getSingleResult();
		
//		j.fernandes@gmail.com
//		123456
		
	}
	
//	public boolean autenticate(String username, String password) {
//		if(username.equals("test@email.com") && password.equals("teste123")) {
//			return true;
//		}
//		return false;
//	}
}
