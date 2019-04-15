package br.com.fiap.andromeda.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.andromeda.DAO.ResidenciaDAO;
import br.com.fiap.andromeda.DAO.UsuarioDAO;
import br.com.fiap.andromeda.DAO.UsuarioResidenciaDAO;
import br.com.fiap.andromeda.entity.Residencia;
import br.com.fiap.andromeda.entity.Usuario;
import br.com.fiap.andromeda.entity.UsuarioResidencia;

/**
 * Teste: Edição de uma residência no contexto de um usuário
 * @author christine
 * @version 1.0
 */
public class TestEditarRes {
	public static void main(String[] args) {
		EntityManager em = null;
		try {
			em = Persistence.createEntityManagerFactory("Andromeda").createEntityManager();
			
			//Usuario em contexto:
			Usuario user = new Usuario();
			UsuarioDAO uDAO = new UsuarioDAO(em);
			user = uDAO.buscar(1);
			
			//Listar as Residencias associadas ao usuario
			List<UsuarioResidencia> ur = new ArrayList<UsuarioResidencia>();
			UsuarioResidenciaDAO urDAO = new UsuarioResidenciaDAO(em);
			ur = urDAO.listarComUsuario(user);
			for(UsuarioResidencia item : ur) {
				System.out.println(item.getAll());
			}
			
			//Selecionada a residencia, executar a edicao:
			Residencia res = new Residencia();
			ResidenciaDAO rDAO = new ResidenciaDAO(em);
			res = rDAO.buscar(5);
			System.out.println(res);
			
			res.setNmResidencia("Zoologico");
			rDAO.atualizar(res);
			System.out.println(rDAO.buscar(5).getAll());
			
			
		}catch(Exception e){
			e.printStackTrace();
			em.getTransaction().rollback();
		}finally {
			if(em != null) {
				em.close();
			}
			System.exit(0);
		}
	}
}
