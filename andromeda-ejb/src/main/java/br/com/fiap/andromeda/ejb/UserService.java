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
	
//	public boolean autenticar(String email, String senha) {
//		List<Usuario> resultado = (List<Usuario>) this.em
//							.createQuery(
//								"SELECT u FROM t_usuario u WHERE u.ds_email = :email AND u.tx_senha = :senha"
//							) 
//							.setParameter("email", email)
//							.setParameter("senha", senha)
//							.getResultList();
//		if(resultado.size() > 0) {
//			return resultado;
//		} 
//		return null;
//	}
	public boolean autenticate(String username, String password) {
		if(username.equals("test@email.com") && password.equals("teste123")) {
			return true;
		}
		return false;
	}
}
