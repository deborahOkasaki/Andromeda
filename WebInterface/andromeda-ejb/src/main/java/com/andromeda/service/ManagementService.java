package com.andromeda.service;

import java.util.ArrayList;
import java.util.List;

import com.andromeda.entity.Comodo;
import com.andromeda.entity.Residencia;
import com.andromeda.entity.Usuario;

public class ManagementService {
	private static List<Residencia> listRes = new ArrayList<Residencia>();
	private static List<Comodo> listCom = new ArrayList<Comodo>();
	private static Usuario user = new Usuario();
	static {
		user = new Usuario(1, "Usuario Teste", "00000000000", "test@email.com", "1234");
		
		Residencia res01 = new Residencia(1, "Principal", 1);
		Residencia res02 = new Residencia(2, "Sítio", 2);
		listRes.add(res01);
		listRes.add(res02);
		
		
		Comodo com01 = new Comodo(res01, 1, "Quarto", 2);
		Comodo com02 = new Comodo(res01, 2, "Sala", 1);
		Comodo com03 = new Comodo(res02, 3, "Cozinha", 3);
		Comodo com04 = new Comodo(res02, 4, "Banheiro", 4);
		listCom.add(com01);
		listCom.add(com02);
		listCom.add(com03);
		listCom.add(com04);
	}
	
	//Retrieve available key
	public int generateResKey() {
		int i = 1;
		int key;
		for(Residencia res :listRes) {
			if(res.getCdResidencia() != i) {
				key = i;
				return key;
			}
			i++;
		}
		return listRes.size() + 1;

	}
	
	public int generateComKey() {
		int i = 1;
		int key;
		for(Comodo com :listCom) {
			if(com.getCdComodo() != i) {
				key = i;
				return key;
			}
			i++;
		}
		return listCom.size()+1;

	}
	
	//User management
	public Usuario authenticate(String username, String password) {
		if(user.getDsEmail().equals(username) && user.getDsSenha().equals(password)) {
			return user;
		}
		return null;
	}
	
	//Residencia management
	public List<Residencia> retrieveRes(){
		return listRes;
	}
	
	public Residencia findRes(int codigo){
		for(Residencia res : listRes) {
			if(res.getCdResidencia() == codigo) {
				return res;
			}
		}
		return null;
	}
	
	public void addRes(Residencia res) {
		listRes.add(res);
	}
	
	public void deleteRes(Residencia res) {
		listRes.remove(res);
	}
	
	public void editRes(int cd, String nm) {
		for(Residencia res : listRes) {
			if(res.getCdResidencia() == cd) {
				res.setNmResidencia(nm);
			}
		}
	}
	
	//Comodo management
	public List<Comodo> retrieveCom(){
		return listCom;
	}
	
	public List<Comodo> retrieveListCom(Residencia res){
		List<Comodo> list = new ArrayList<Comodo>();
		for(Comodo com : listCom) {
			if(com.getCdResidencia().getCdResidencia() == res.getCdResidencia()) {
				list.add(com);
			}
			
		}
		return list;
	}
	
	public void deleteCom(int cod) {
		for(Comodo com : listCom) {
			if(cod == com.getCdComodo()) {
				listCom.remove(com);
			}
		}	
	}
	
	public void addCom(Comodo com) {
		listCom.add(com);
	}
	
	public void editCom(int cd, String nm) {
		for(Comodo com : listCom) {
			if(com.getCdComodo() == cd) {
				com.setNmComodo(nm);
			}
		}
	}
}
