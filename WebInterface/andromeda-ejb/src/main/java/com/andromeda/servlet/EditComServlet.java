package com.andromeda.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andromeda.entity.Comodo;
import com.andromeda.entity.Residencia;
import com.andromeda.service.ManagementService;

@WebServlet(value = "/editCom")
public class EditComServlet extends HttpServlet{
	private ManagementService service = new ManagementService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		//Editando a residencia
		int cCom = Integer.parseInt(req.getParameter("edComCd"));
		String nCom = req.getParameter("edComNm");
		service.editCom(cCom, nCom);
		
		res.sendRedirect("/main");
	}
}
