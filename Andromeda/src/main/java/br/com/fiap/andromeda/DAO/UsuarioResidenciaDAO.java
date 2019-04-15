package br.com.fiap.andromeda.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.andromeda.entity.Residencia;
import br.com.fiap.andromeda.entity.Usuario;
import br.com.fiap.andromeda.entity.UsuarioResidencia;
import br.com.fiap.andromeda.entity.UsuarioResidenciaPK;

public class UsuarioResidenciaDAO extends GenericDAO<UsuarioResidencia, UsuarioResidenciaPK> {

	public UsuarioResidenciaDAO(EntityManager GerenciadorEntidade) {
		super(GerenciadorEntidade);
	}
	
	@SuppressWarnings("unchecked")
	public List<UsuarioResidencia> listarComUsuario(Usuario user) {
		return this.GerenciadorEntidade.createQuery("from UsuarioResidencia where cdUsuario = :user")
		.setParameter("user", user).getResultList();
	}
}
