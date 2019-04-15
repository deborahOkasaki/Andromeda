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

@WebServlet(value = "/createRes")
public class CreateResServlet extends HttpServlet{
	private ManagementService service = new ManagementService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		//Montando a residencia
		List<Residencia> list = service.retrieveRes();
		int cRes = service.generateResKey();
		String nRes = req.getParameter("resName");
		int tRes = Integer.parseInt(req.getParameter("resType"));
		Residencia newRes = new Residencia(cRes, nRes, tRes);
		service.addRes(newRes);
		
		res.sendRedirect("/main");
	}
}
