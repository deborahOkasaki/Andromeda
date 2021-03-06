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

@WebServlet(value = "/createcom")
public class CreateComServlet extends HttpServlet{
	private ManagementService service = new ManagementService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int cCom = service.generateComKey();
		Residencia cRes = service.findRes(Integer.parseInt(req.getParameter("resCode")));
		String nCom = req.getParameter("comName");
		int tCom = Integer.parseInt(req.getParameter("comType"));
		Comodo newCom = new Comodo(cRes, cCom, nCom, tCom);
		service.addCom(newCom);
		
		res.sendRedirect("/main");
	}
}
